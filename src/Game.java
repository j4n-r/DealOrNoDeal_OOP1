import com.sun.nio.file.ExtendedWatchEventModifier;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    public static Koffer getPlayersChoice(){

        System.out.println("Welchen Koffer würden sie gerne festlegen als Goldenen Koffer?");


        return Koffer.findKofferByZahl(scanner.nextInt());
    }

    public static void openKoffer() {
        System.out.println("Welchen Koffer möchten sie öffnen? ");

        try {
            Koffer openedKoffer = Koffer.findKofferByZahl(scanner.nextInt());
            if (openedKoffer.getPlayerChoice()) {
                System.out.println("Dies ist dein Goldener Koffer, diesen kannst du nicht öffnen");
                openKoffer();
                return;
            }
            System.out.println("In dem geöffneten Koffert sind: " + openedKoffer.getKofferWert());
            Koffer.kofferListe.remove(openedKoffer);
            Koffer.werte.remove(Integer.valueOf(openedKoffer.getKofferWert()));
        } catch (Exception e)  {
            System.out.println("Dieser Koffer ist nicht mehr verfügbar, probieren sie es nochmal");
            openKoffer();
        }

    }

}
