package controlflow;

public class LoopChallenge {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sumOfMatches += i;
                countOfMatches++;
                System.out.println("Found a match = " + i);
            }
            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }


}

