import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Koffer {
    int kofferWert;
    int kofferZahl;
    int playerChoice;
    private static ArrayList<Integer> werte = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 250, 500, 750, 1000, 2500, 5000, 10000, 20000, 25000, 50000, 100000, 150000, 250000));

    public static ArrayList<Koffer> kofferListe = new ArrayList<Koffer>();


    public Koffer(int kofferWert, int kofferZahl, int playerChoice) {
        this.kofferWert = kofferWert;
        this.playerChoice = playerChoice;
        this.kofferZahl = kofferZahl;
    }

    public Koffer(int kofferWert, int kofferZahl) {
        this.kofferWert = kofferWert;
        this.kofferZahl = kofferZahl;
    }

    public Koffer(int KofferZahl) {
        this.kofferZahl = KofferZahl;
    }

    public static ArrayList<Koffer> initKoffer() {

        for (int i = 1; i <= 20; i++) {
            kofferListe.add(new Koffer(i));
        }
        return kofferListe;
    }

    public static void initKofferWert() {
        Collections.shuffle(werte);

        for (int i = 0; i < kofferListe.size(); i++) {
            kofferListe.get(i).setKofferWert(werte.get(i));
        }

    }

    public static void printRemainingKoffer() {
        System.out.print("Verfügbare Koffer: ");
        for (Koffer koffer : kofferListe) {
            System.out.print(koffer.getKofferZahl() + " ");
        }

        System.out.println();
    }

//    public static void printKofferWert() {
//
//        System.out.print("Verfügbare Werte: ");
//        for (Koffer koffer : kofferListe) {
//            System.out.print(koffer.getKofferWert() + " ");
//        }
//
//        System.out.println();
//    }

    public static void printRemainingWerte() {
        ArrayList<Integer> sortedList = new ArrayList<>(werte);
        Collections.sort(sortedList);
        System.out.print("Verfügbare Werte: ");
        for (int wert : sortedList) {
            System.out.print(wert + " ");
        }
        System.out.println();

    }

    public static void openKoffer() {

    }

    public static ArrayList<Integer> getWerte() {
        return werte;
    }

    public static void setWerte(ArrayList<Integer> werte) {
        Koffer.werte = werte;
    }

    public int getKofferWert() {
        return kofferWert;
    }

    public void setKofferWert(int kofferWert) {
        this.kofferWert = kofferWert;
    }

    public int getKofferZahl() {
        return kofferZahl;
    }

    public void setKofferZahl(int kofferZahl) {
        this.kofferZahl = kofferZahl;
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(int playerChoice) {
        this.playerChoice = playerChoice;
    }

}



