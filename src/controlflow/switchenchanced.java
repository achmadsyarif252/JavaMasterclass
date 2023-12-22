package controlflow;

public class switchenchanced {
    public static void main(String[] args) {
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("letter " + charValue + "was not found in the switch");
                break;
        }

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("");
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day) {
        String nameOfDay = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + nameOfDay);
    }

    public static void printWeekDay(int day) {
        String nameOfDay = "Invalid day";
        if (day == 0) {
            nameOfDay = "Sunday";
        } else if (day == 1) {
            nameOfDay = "Monday";
        } else if (day == 2) {
            nameOfDay = "Tuesday";
        } else if (day == 3) {
            nameOfDay = "Wednesday";
        } else if (day == 4) {
            nameOfDay = "Thursday";
        } else if (day == 5) {
            nameOfDay = "Friday";
        } else if (day == 6) {
            nameOfDay = "saturday";
        }
        System.out.println(day + " stands for " + nameOfDay);
    }
}
