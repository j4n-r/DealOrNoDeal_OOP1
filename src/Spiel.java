import java.util.Scanner;

public class Spiel {

    static Scanner scanner = new Scanner(System.in);


    public static Koffer getPlayersChoice() {
        try {
            System.out.println("Welchen Koffer würden sie gerne festlegen als Goldenen Koffer?");
            int userInput = scanner.nextInt();

            if (userInput >= 1 && userInput <= 20) {
                System.out.println("Sie haben den Koffer Nr. " + userInput + " als ihren Goldenen Koffer festgelegt");
                return Koffer.findKofferByZahl(userInput);
            } else {
                System.err.println("Sie müssen eine Zahl zwischen 1 und 20 eingeben");
            }
        } catch (Exception e) {
            System.err.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 20 ein.");
            scanner.next(); // Consume the invalid input to avoid an infinite loop
        }
        return getPlayersChoice();
    }

    public static void openKoffer() {
        System.out.println("Welchen Koffer möchten Sie öffnen? ");

        try {
            Koffer openedKoffer = Koffer.findKofferByZahl(scanner.nextInt());

            if (openedKoffer.getPlayerChoice()) {
                System.err.println("Dies ist Ihr Goldener Koffer, diesen können Sie nicht öffnen");
                Tafel.printRemainingKoffer();
                Tafel.printRemainingWerte();
                openKoffer();
                return;
            }
            System.out.println("In dem geöffneten Koffer sind: € " + openedKoffer.getKofferWert());


            Koffer.getKofferListe().remove(openedKoffer);
            Koffer.getWerte().remove(Integer.valueOf(openedKoffer.getKofferWert()));
            return;

        } catch (Exception e) {
            System.err.println("Falsches Eingabeformat oder der Koffer wurde schon geöffnet, probieren Sie es nochmal");
            scanner.next();
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
        }
        openKoffer();
    }

    public static int switchKoffer(String userChoice) {
        Koffer playerKoffer = null;
        Koffer otherKoffer = null;


        // loop over the last 2 Koffers and set the playerKoffer to the Koffer which has the playerChoice set to true
        for (Koffer koffer : Koffer.getKofferListe()) {
            if (koffer.getPlayerChoice()) {
                playerKoffer = koffer;
            } else {
                otherKoffer = koffer;
            }
        }
        // return the value of the Koffer which the player has chosen
        switch (userChoice) {
            case "behalten":
                if (playerKoffer != null) {
                    return playerKoffer.getKofferWert();
                }
                break;
            case "tauschen":
                if (otherKoffer != null) {
                    return otherKoffer.getKofferWert();
                }
                break;
            default:
                System.err.println("Falsche Eingabe, bitte geben Sie behalten oder tauschen ein");
        }

        return 0;
    }

}
