import java.util.Scanner;

public class GameLauncher {
    public static void startGame() {
        Koffer.initKoffer();
        Koffer.initKofferWert();
        Tafel.printRemainingKoffer();
        Tafel.printRemainingWerte();
        Koffer.setPlayerChoice(Game.getPlayersChoice());

        if (firstRound()) {
            printWinner();
            return;
        }
        if (secondRound()) {
            printWinner();
            return;
        }
        if (thirdRound()) {
            printWinner();
            return;
        }if (fourthRound()) {
            printWinner();
            return;
        }if (fifthRound()) {
            printWinner();
            return;
        }if (sixthRound()) {
            printWinner();
            return;
        }
        lastRound();
    }

    private static void printWinner() {
        System.out.printf("Das Spiel ist zu ende du hast € %.2f gewonnen", Bank.calcOffer());
    }


    private static boolean firstRound() {
        for (int i = 0; i < 6; i++) {
            playRound();
        }
        return Bank.makeOffer();
    }
    private static boolean secondRound() {
        for (int i = 0; i < 3; i++) {
            playRound();
        }
        return Bank.makeOffer();
    }

    private static boolean thirdRound() {
        for (int i = 0; i < 3; i++) {
            playRound();
        }
        return Bank.makeOffer();
    }

    private static boolean fourthRound() {
        for (int i = 0; i < 3; i++) {
            playRound();
        }
        return Bank.makeOffer();
    }

    private static boolean fifthRound() {
        for (int i = 0; i < 2; i++) {
            playRound();
        }
        return Bank.makeOffer();
    }

    private static boolean sixthRound() {
        for (int i = 0; i < 1; i++) {
            playRound();
        }
        return Bank.makeOffer();
    }

    private static void lastRound() {
        System.out.println("Es sind nur noch 2 Koffer übrig, wollen Sie ihren Koffer behalten oder tauschen?");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        int gewinn = Game.switchCases(userChoice);
        System.out.println("In ihrem Koffer befinden sich € " +  gewinn );
        System.out.println("Glückwunsch sei haben € " + gewinn + " gewonnen.");

    }

    private static void playRound() {
        Tafel.printRemainingKoffer();
        Tafel.printRemainingWerte();
        Game.openKoffer();
    }

}
