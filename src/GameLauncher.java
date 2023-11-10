import java.util.Scanner;

public class GameLauncher {
    public static void startGame() {
        Koffer.initKoffer();
        Koffer.initKofferWert();
        Tafel.printRemainingKoffer();
        Tafel.printRemainingWerte();
        Koffer.setPlayerChoice(Game.getPlayersChoice());
        if (firstRound()) {
            System.out.println("Das Spiel ist zu ende sie haben " + Bank.calcOffer() + " Euro gewonnen");
            return;
        }
        if (secondRound()) {
            System.out.println("Das Spiel ist zu ende sie haben " + Bank.calcOffer() + " Euro gewonnen");
            return;
        }
        if (thirdRound()) {
            System.out.println("Das Spiel ist zu ende sie haben " + Bank.calcOffer() + " Euro gewonnen");
            return;
        }if (fourthRound()) {
            System.out.println("Das Spiel ist zu ende sie haben " + Bank.calcOffer() + " Euro gewonnen");
            return;
        }if (fifthRound()) {
            System.out.println("Das Spiel ist zu ende sie haben " + Bank.calcOffer() + " Euro gewonnen");
            return;
        }if (sixthRound()) {
            System.out.println("Das Spiel ist zu ende sie haben " + Bank.calcOffer() + " Euro gewonnen");
            return;
        }
        lastRound();


    }
    public static boolean firstRound() {
        for (int i = 0; i < 6; i++) {
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
            Game.openKoffer();
        }
        return Bank.makeOffer();
    }
    public static boolean secondRound() {
        for (int i = 0; i < 3; i++) {
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
            Game.openKoffer();
        }
        return Bank.makeOffer();
    }

    public static boolean thirdRound() {
        for (int i = 0; i < 3; i++) {
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
            Game.openKoffer();
        }
        return Bank.makeOffer();
    }

    public static boolean fourthRound() {
        for (int i = 0; i < 3; i++) {
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
            Game.openKoffer();
        }
        return Bank.makeOffer();
    }

    public static boolean fifthRound() {
        for (int i = 0; i < 2; i++) {
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
            Game.openKoffer();
        }
        return Bank.makeOffer();
    }

    public static boolean sixthRound() {
        for (int i = 0; i < 1; i++) {
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
            Game.openKoffer();
        }
        return Bank.makeOffer();
    }

    public static void lastRound() {
        System.out.println("Es sind nur noch 2 Koffer übrig, wollen sie ihren Koffer behalten oder tauschen?");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        int gewinn = Game.switchCases(userChoice);
        System.out.println("In ihrem Koffer befinden sich " +  gewinn + " Euro");
        System.out.println("Glückwunsch sei haben " + gewinn + " Euro gewonnen.");

    }

}
