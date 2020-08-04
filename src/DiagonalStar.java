public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int size) {
        if (size < 5) System.out.println("Invalid Value");

        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row == 1 || column == 1 || row == column || row == size || column == size || column == (size - row) + 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
