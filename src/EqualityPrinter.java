public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,12,0);
    }

    public static void printEqual (int x, int y, int z) {
        //int sum = x + y + z;
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && y ==z) {
            System.out.println("All numbers are equal");
        } else if (!(x == y && y ==z) && (x == y || x == z || y == z)){
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
