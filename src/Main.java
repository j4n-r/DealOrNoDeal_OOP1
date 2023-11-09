public class Main {
    public static void main(String[] args) {
        Koffer.initKoffer();
        System.out.println(Koffer.KofferListe.size());

        for (Koffer koffer: Koffer.KofferListe) {
            System.out.println("Koffer: " + koffer.kofferZahl);
            koffer.initKofferWert();
            System.out.println(koffer.kofferWert);

        }
    }
}
