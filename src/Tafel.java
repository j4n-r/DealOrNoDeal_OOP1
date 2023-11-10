import java.util.ArrayList;
import java.util.Collections;

public class Tafel {
    public static void printRemainingKoffer() {
        System.out.print("Verfügbare Koffer: ");
        for (Koffer koffer : Koffer.kofferListe) {
            System.out.print(koffer.getKofferZahl() + " ");
        }

        System.out.println();
    }

    public static void printRemainingWerte() {
        ArrayList<Integer> sortedList = new ArrayList<>(Koffer.werte);
        Collections.sort(sortedList);
        System.out.print("Verfügbare Werte: ");
        for (int wert : sortedList) {
            System.out.print(wert + " ");
        }
        System.out.println();

    }
}
