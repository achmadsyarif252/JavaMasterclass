package controlflow;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        String reverse = "";
        int x = number;
        while (x > 9) {
            reverse += x % 10;
            x = x / 10;
        }
        return Integer.parseInt(reverse + x) == number;
    }

    public static boolean simpleCekPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse + original % 10;
            original /= 10;
        }
        return reverse == number;
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sumNumber = 0;
        while (number != 0) {
            if (number % 2 == 0) sumNumber += number % 10;
            number /= 10;
        }
        return sumNumber;
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) return false;
        for (int i = a; i > 0; i /= 10) {
            for (int j = b; j > 0; j /= 10) {
                if (i % 10 == j % 10) return true;
            }
        }
        return false;
    }

    public static boolean hasSharedDigitAlternative(int first, int second) {

        boolean firstValid = first > 9 && first < 100;
        boolean secondValid = second > 9 && second < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) return false;
        int lastX = x % 10;
        int lastY = y % 10;
        int lastZ = z % 10;

        if (lastX == lastY || lastX == lastZ || lastY == lastZ) return true;
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }
}
