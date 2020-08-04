public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2,7,18));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigBags = 0;
        for (int i = 0; i <= bigCount; i++) {
            if ((i * 5) <= goal) {
                bigBags = i;
            }
        }
        return ((bigBags * 5) + smallCount) >= goal;
    }
}

