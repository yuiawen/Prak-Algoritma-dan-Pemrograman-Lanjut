import java.util.Scanner;

public class array2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cats[][] = new String[4][2];

        // input nama dan warna kucing
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan nama kucing " + (i + 1) + " : ");
            cats[i][0] = in.nextLine();
            System.out.print("Masukkan warna kucing " + (i + 1) + " : ");
            cats[i][1] = in.nextLine();
        }
        // cetak nama dan warna kucing
        System.out.println("Nama Kucing\tWarna");
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats[i].length; j++) {
                System.out.print(cats[i][j]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }

}
