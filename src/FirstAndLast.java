public class FirstAndLast {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(121));

    }
    public static int sumFirstAndLastDigit (int number) {
        int remainingNumbers = number;
        int lastDigit = number % 10;

        if (number < 0) return -1;
        while (remainingNumbers >= 10) {
            remainingNumbers /= 10;
        }
        return remainingNumbers + lastDigit;
    }


    }

