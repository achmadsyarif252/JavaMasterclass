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
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
}
