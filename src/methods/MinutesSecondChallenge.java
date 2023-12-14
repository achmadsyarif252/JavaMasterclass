package methods;

public class MinutesSecondChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(898989798));
        System.out.println(getDurationString(-8));
        System.out.println(getDurationString(85, 98));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds("+ seconds +"), must be a positive integer value";
        } else {
            return getDurationString(seconds / 60, seconds % 60);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes + " ), must be a positive integer value";
        }
        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;//sisa dibagi dengan jam misal 65 menit itu satu jam sisanya 5 menit
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
