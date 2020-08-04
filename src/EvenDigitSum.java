public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1221));

    }
    public static int getEvenDigitSum (int number) {
        if (number < 0) return -1;
        int evenSum = 0;
        int remaingNumber = number;

        while (remaingNumber > 0) {
            int lastDigit = remaingNumber % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;

            }
            remaingNumber /= 10;
        }
        return evenSum;

    }
}
