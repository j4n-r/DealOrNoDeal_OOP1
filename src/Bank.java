import java.util.Scanner;

public class Bank {

    public static double calcOffer() {

        int sum = 0;
        for (int werte : Koffer.getWerteListe()) {
            sum += werte;
        }
        return (sum / (double) Koffer.getWerteListe().size()) * 0.6;
    }

    public static boolean makeOffer() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Die Bank bietet: € %.2f \n", calcOffer());
        System.out.println("Wollen Sie dieses Angebot annehmen? ");

        String playerChoice = scanner.nextLine().toUpperCase(); // Convert to lowercase for case-insensitivity

        switch (playerChoice) {
            case "JA":
                return true;
            case "NEIN":
                return false;
            default:
                System.err.println("Falsche Eingabe, bitte geben Sie Ja oder Nein ein");
                return makeOffer();
        }
    }

}
