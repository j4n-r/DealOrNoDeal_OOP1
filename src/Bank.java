import java.nio.file.attribute.GroupPrincipal;
import java.util.Scanner;

public class Bank {
    public static double calcOffer() {

        int sum= 0;
        for (int werte: Koffer.werte) {
            sum += werte;
        }
       return (sum/ (double)Koffer.werte.size()) * 0.6;
    }

    public static boolean makeOffer() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("The bank bietet: " + calcOffer() + " an");
            System.out.println("Wollen sie dieses Angebot annehmen? ");

            String playerChoice = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

            if (playerChoice.equals("ja")) {
                return true;
            } else if (playerChoice.equals("nein")) {
                return false;
            } else {
                System.out.println("Sie müssen das Angebot entweder mit ja annehmen oder mit nein ablehnen");
            }
        }
    }

}
