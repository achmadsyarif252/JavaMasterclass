package methods;

public class TeenNumberChecker {
    public static boolean hasTeen(int first,int second,int third){
        return isTeen(first)||isTeen(second)||isTeen(third);
    }

    public static boolean isTeen(int first){
        return first >12 && first<20;
    }
}