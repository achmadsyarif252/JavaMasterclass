package controlflow;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || month > 9999) return -1;
        boolean isLeapYear = isLeapYear(year);
        int totaldays = switch (month) {
            case 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> {
                yield 31;
            }
            case 2 -> {
                if (isLeapYear) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> -1;
        };
        return totaldays;
    }
}