public class Sum3And5 {
    public static void main(String[] args) {
        int sumAll = 0;
        int sum5 = 0;
        for (int i = 1; i<=1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sum5++;
                sumAll += i;
                System.out.println(i);

            }
            if (sum5 == 5) {
                break;
            }
        }
        System.out.println(sumAll);
        }
    }

