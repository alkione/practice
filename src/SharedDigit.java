public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(24, 52));
    }

    public static boolean hasSharedDigit(int number1,int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int lastDigit2 = number2 % 10;
        int firstDigit2 = (number2 / 10);
        boolean hasSharedDigit = false;
        while (number1 != 0) {
            int lastDigit = number1 % 10;
            if (lastDigit == lastDigit2 || lastDigit == firstDigit2) {
                hasSharedDigit = true;
                break;
            }
            number1 /= 10;
        }
        return hasSharedDigit;
    } }



