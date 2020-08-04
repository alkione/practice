public class lastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit( 123, 323, 1111));
        System.out.println(isValid( 9));
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {
        if (((a < 10) || (b < 10) || (c < 10)) || ((a > 1000) || (b < 10) || (c < 10)) ) return false;

        int lastA;
        int lastB;
        int lastC;

        if ((a / 1000) > 0) {
            lastA = a % 1000;
        } else if ((a / 100) > 0) {
            lastA = a % 100;
        } else if ((a / 10) > 0) {
            lastA = a % 10;
        } else {lastA = 1;}

        if ((a / 1000) > 0) {
            lastB = b % 1000;
        } else if ((b / 100) > 0) {
            lastB = a % 100;
        } else if ((b / 10) > 0) {
            lastB = b % 10;
        } else {lastB = 1;}

        if ((a / 1000) > 0) {
            lastC = c % 1000;
        } else if ((c / 100) > 0) {
            lastC = a % 100;
        } else if ((c / 10) > 0) {
            lastC = c % 10;
        } else {lastC = 1;}


        if (lastA == lastB || lastA == lastC || lastB == lastC) {
            return true; } else return false;
    }

    public static boolean isValid (int a) {
        return (a >= 10 && a <= 1000);
    }
}
