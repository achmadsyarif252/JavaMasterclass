package methods;
public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        return kilometersPerHour<0 ? -1l:Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long conversiontResult = toMilesPerHour(kilometersPerHour);
        System.out.println(conversiontResult==-1?"Invalid Value":kilometersPerHour+" km/h = "+conversiontResult+" mi/h");
    }
}