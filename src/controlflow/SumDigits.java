package controlflow;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(859856));
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1;
        if (number < 10) return number;

        int total = 0;

        while (true) {
            total += number % 10;
            number = number / 10;
            if (number < 10) {
                total += number;
                break;
            }
        }
        return total;
    }

    public static int sumDigitsSolution2(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
