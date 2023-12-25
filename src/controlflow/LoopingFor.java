package controlflow;

public class LoopingFor {
    public static void main(String[] args) {
        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interetstAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + " % interest = " + interetstAmount);
        }

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interetstAmount = calculateInterest(100.0, rate);
            if (interetstAmount > 8.5) {
                break;
            }
            System.out.println("100 at " + rate + " % interest = " + interetstAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
