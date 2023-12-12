import java.util.ArrayList;
import java.util.Collections;

public class Tafel {

    public static void printRemainingKoffer() {
        ArrayList<Integer> kofferNrList = new ArrayList<>();
        for (Koffer koffer : Koffer.getKofferListe()) {
            kofferNrList.add(koffer.getKofferZahl());
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Verfügbare Koffer-Nr:");
        for (int i = 0; i < kofferNrList.size(); i++) {
            System.out.printf("%-10d", kofferNrList.get(i));
            if ((i + 1) % 5 == 0 || i == kofferNrList.size() - 1) { // Start a new line after every 5 values or at the end
                System.out.println();
            }
        }
        System.out.println();
    }


    public static void printRemainingWerte() {
        ArrayList<Integer> sortedList = new ArrayList<>(Koffer.getWerte());
        Collections.sort(sortedList);

        System.out.println("Verfügbare Preise:");
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.printf("%-10s", formatEuro(sortedList.get(i)));
            if ((i + 1) % 5 == 0 || i == sortedList.size() - 1) {  // Start a new line after every 5 values or at the end
                System.out.println();
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println();
    }

    private static String formatEuro(int value) {
        return "€ " + value;
    }
}
