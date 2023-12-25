package controlflow;

public class WhileChallenge {
    public static void main(String[] args) {
        int i = 5;
        int end = 20;
        int totalEven = 0;
        int totalOdd = 0;

        while (i <= end) {
            i++;
            if (!isEvenNumber(i)) {
                totalOdd++;
                continue;
            }
            System.out.println(i + " adalah pasti bilangan genap");
            totalEven++;
            if (totalEven == 5) break;
        }
        System.out.println("Total odd number = " + totalOdd);
        System.out.println("Total even number = " + totalEven);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
