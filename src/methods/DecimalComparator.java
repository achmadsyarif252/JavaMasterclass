package methods;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        long longNumber1 = (long) (num1 * 1000);
        long longNumber2 = (long) (num2 * 1000);
        return longNumber1 == longNumber2;
    }
}