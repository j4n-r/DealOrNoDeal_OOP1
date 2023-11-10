import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    public static Koffer getPlayersChoice(){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Welchen Koffer würden sie gerne festlegen als Goldenen Koffer?");
                int userInput = scanner.nextInt();

                if (userInput >= 1 && userInput <= 20) {
                    return Koffer.findKofferByZahl(userInput);
                } else {
                    System.err.println("Sie müssen eine Zahl zwischen 1 und 20 eingeben");
                }
            } catch (Exception e) {
                System.err.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 20 ein.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }
    }

    public static void openKoffer() {

        while (true) {
            System.out.println("Welchen Koffer möchten sie öffnen? ");

            try {
                Koffer openedKoffer = Koffer.findKofferByZahl(scanner.nextInt());

                if (openedKoffer.getPlayerChoice()) {
                    System.err.println("Dies ist dein Goldener Koffer, diesen kannst du nicht öffnen");
                    Tafel.printRemainingKoffer();
                    Tafel.printRemainingWerte();
                    openKoffer();
                    return;
                }
                System.out.println("In dem geöffneten Koffer sind: " + openedKoffer.getKofferWert());

                Koffer.kofferListe.remove(openedKoffer);
                Koffer.werte.remove(Integer.valueOf(openedKoffer.getKofferWert()));
                return;

            } catch (Exception e)  {
                System.err.println("Falsches Eingabeformat oder der Koffer wurde schon geöffnet, probieren sie es nochmal");
                scanner.next();
                Tafel.printRemainingKoffer();
                Tafel.printRemainingWerte();
            }
        }


    }

    public static int switchCases(String userChoice) {

        if (userChoice.equals("behalten")) {
            for (Koffer koffer: Koffer.kofferListe) {
                if (koffer.playerChoice) {
                    return koffer.kofferWert;
                }
            }

        } else if(userChoice.equals("tauschen")) {
            for (Koffer koffer: Koffer.kofferListe) {
                if (!koffer.playerChoice) {
                    return koffer.kofferWert;
                }
            }
        }
            System.err.println("Not a viable option");
            switchCases(userChoice);
            return 0;

    }

}
