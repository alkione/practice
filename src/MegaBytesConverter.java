public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid value");
        } else {
            int mb = kiloBytes / 1024;
            int leftie = kiloBytes - 1024*mb;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + leftie + " KB" );
        }

    }

}
