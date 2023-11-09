import java.util.ArrayList;

public class Koffer {
    int kofferWert;
    int kofferZahl;
    int playerChoice;
    int[] werte = {1,2,5,10,20,50,100,250,500,750,1000,2500,5000, 10000,20000,25000,50000,100000, 150000,250000};
    public static ArrayList<Koffer> KofferListe = new ArrayList<Koffer>();


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

    public static ArrayList<Koffer> initKoffer(){

        for (int i = 1 ; i <= 20 ; i++) {
            KofferListe.add(new Koffer(i));
        }
        return KofferListe;
    }

    public  ArrayList<Koffer> initKofferWert() {
            for (int i = 0; i < KofferListe.size(); i++) {
                KofferListe.get(i).setKofferWert(werte[i]);
            }


        return KofferListe;
    }

//    public static String toString() {
//        return KofferListe.toString();
//    }
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

    public int[] getWerte() {
        return werte;
    }

    public void setWerte(int[] werte) {
        this.werte = werte;
    }
}
