import java.util.*;


public class Koffer {
    private int kofferWert;
    private int kofferZahl;
    private boolean playerChoice;
    private static List<Integer> werteListe = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 250, 500, 750, 1000, 2500, 5000, 10000, 20000, 25000, 50000, 100000, 150000, 250000));
    private static List<Koffer> kofferListe = new ArrayList<>();

    public Koffer(int kofferZahl) {
        this.kofferZahl = kofferZahl;
    }

    public static void initKoffer() {

        for (int i = 1; i <= 20; i++) {
            kofferListe.add(new Koffer(i));
        }
    }

    public static void initKofferWert() {

        Collections.shuffle(werteListe); // Starts from the back, switches the current value with a random value from the front

//        for (int i = werte.size() - 1; i > 0; i--) {
//            Integer temp = 0;
//            temp = werte.get(i); // store current value in temp
//            Random random = new Random();
//
//            int randomIndex = random.nextInt(werte.size() - 1); // get random index
//            werte.set(i, werte.get(randomIndex)); // set current value to value from random index
//            werte.set(randomIndex, temp); // set the value from random index to temp (previous value) (swap values essentially)
//        }

        // set KofferWert based on KofferListe
        for (int i = 0; i < kofferListe.size(); i++) {
            kofferListe.get(i).setKofferWert(werteListe.get(i));
        }

    }

    public static Koffer findKofferByZahl(int targetKofferZahl) {
        for (Koffer koffer : Koffer.kofferListe) {
            if (koffer.getKofferZahl() == targetKofferZahl) {
                return koffer; // Found the desired Koffer
            }
        }
        return null; // Koffer with the specified kofferZahl not found
    }

    public static List<Integer> getWerteListe() {
        return werteListe;
    }

    public static void setWerteListe(ArrayList<Integer> werteListe) {

        Koffer.werteListe = werteListe;
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

public boolean getPlayerChoice() {

        return playerChoice;
    }

    public static void setPlayerChoice(Koffer targetKoffer) {
        targetKoffer.playerChoice = true;

    }

    public static void setWerte(List<Integer> werte) {
        Koffer.werteListe = werte;
    }

    public static List<Koffer> getKofferListe() {
        return kofferListe;
    }

    public static void setKofferListe(List<Koffer> kofferListe) {
        Koffer.kofferListe = kofferListe;
    }
}



