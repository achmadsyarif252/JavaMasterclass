package controlflow;

public class course00 {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3,a 4, or a 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("Was not 1,2,3,4 or 5");
        }
        String month = "Octobesr";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st Quarter";
            case "April", "May", "June" -> "2nd Quarter";
            case "July", "August", "September" -> "3rd Quarter";
            case "October", "November", "Decemeber" -> "4th Quarter";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
