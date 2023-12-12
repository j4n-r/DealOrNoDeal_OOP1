import java.util.Scanner;

public class GameLauncher {
    public static void startGame() {
        Koffer.initKoffer();
        Koffer.initKofferWert();
        Tafel.printRemainingKoffer();
        Tafel.printRemainingWerte();
        Koffer.setPlayerChoice(Game.getPlayersChoice());


        for (int round = 1; round <= 7; round++) {
            if (playRound(round)) {
                printWinner();
                return;
            }
        }
        lastRound();
    }

    private static void printWinner() {
        System.out.printf("Das Spiel ist zu ende du hast € %.2f gewonnen", Bank.calcOffer());
    }

    private static boolean playRound(int round) {
        switch (round) {
            case 1 -> roundActions(6); // first round  (open 6 Koffer)
            case 2,3,4 -> roundActions(3); // 2,3,4, round open 3 Koffer
            case 5 -> roundActions(2); // 5 round open 2 Koffer
            case 6 -> roundActions(1); // 6 round open 1 Koffer
            default -> throw new IllegalArgumentException(); // required,  but should never happen
        }
        return false;
    }

    private static boolean roundActions(int numberOfActions) {
        for (int i = 0; i < numberOfActions; i++) {
            Tafel.printRemainingKoffer();
            Tafel.printRemainingWerte();
            Game.openKoffer();
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


}
