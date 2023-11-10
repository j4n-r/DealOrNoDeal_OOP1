public class Main {
    public static void main(String[] args) {
        Koffer.initKoffer();
        Koffer.initKofferWert();
        Tafel.printRemainingKoffer();
        Tafel.printRemainingWerte();

        Koffer.setPlayerChoice(Game.getPlayersChoice());
        Game.openKoffer();
        Tafel.printRemainingKoffer();
        Tafel.printRemainingWerte();

    }
}
