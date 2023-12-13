package methods;

public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("El", calculateHighScorePosition(1500));

        displayHighScorePosition("Kholid", calculateHighScorePosition(1000));

        displayHighScorePosition("Syarif", calculateHighScorePosition(500));

        displayHighScorePosition("Tyo", calculateHighScorePosition(100));

        displayHighScorePosition("Putra Hari Diewa Evan", calculateHighScorePosition(25));
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
}
