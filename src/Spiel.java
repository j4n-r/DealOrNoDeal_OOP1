import java.util.Scanner;

public class Spiel {
    static Scanner scanner = new Scanner(System.in);

    public static Koffer getPlayersChoice() {

        Scanner scanner = new Scanner(System.in);
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

    public static int switchCases(String userChoice) {
        if (userChoice.equals("behalten")) {
            for (Koffer koffer : Koffer.getKofferListe()) {
                if (koffer.getPlayerChoice()) {
                    return koffer.getKofferWert();
                }
            }

        } else if (userChoice.equals("tauschen")) {
            for (Koffer koffer : Koffer.getKofferListe()) {
                if (!koffer.getPlayerChoice()) {
                    return koffer.getKofferWert();
                }
            }
        }
        System.err.println("Not a viable option");
        switchCases(userChoice);
        return 0;

    }

}
