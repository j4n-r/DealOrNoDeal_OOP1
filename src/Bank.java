import java.util.Scanner;

public class Bank {
    public static double calcOffer() {

        int sum= 0;
        for (int werte: Koffer.getWerte()) {
            sum += werte;
        }
       return (sum/ (double) Koffer.getWerte().size()) * 0.6;
    }

    public static boolean makeOffer() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Die Bank bietet: € %.2f \n", calcOffer());
            System.out.println("Wollen Sie dieses Angebot annehmen? ");

            String playerChoice = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

            if (playerChoice.equalsIgnoreCase("ja")) {
                return true;
            } else if (playerChoice.equalsIgnoreCase("nein")) {
                return false;
            } else {
                System.out.println("Sie müssen das Angebot entweder mit ja annehmen oder mit nein ablehnen");
            }
        }
    }

}
