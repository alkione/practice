public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
    }

    public static boolean hasEqualSum (int x, int y, int z) {
        if ((x+y) == z) {
            return true;
        }
        return false;
    }
}
