public class SpeedConverter {
    public static void main(String[] args) {

        double kilemetersPerHour = 25.42;
        System.out.println(toMilesPerHour(kilemetersPerHour));
        printConversion(kilemetersPerHour);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        long milesPerHour;
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
        }
        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour){
        if (toMilesPerHour(kilometersPerHour) == -1){
            System.out.println("Invalid value");
        } else
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
