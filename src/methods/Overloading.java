package methods;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(10));
        System.out.println(convertToCentimeters(0,68));
    }

    public static double convertToCentimeters(int inch) {
        return inch * 2.54d;
    }

    public static double convertToCentimeters(int feet, int inch) {
        return convertToCentimeters(inch + (feet * 12));
    }
}
