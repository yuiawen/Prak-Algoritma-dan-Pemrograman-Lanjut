import java.util.Scanner;

public class ProyekHitungJumlah2 {
    public static int hitungJumlah(int[] x) {
        int jum = 0;
        for (int i = 0; i < x.length; i++) {
            jum += x[i];
        }
        return jum;
    }

    public static double hitungRata(int[] data, int jum) {
        double rata = (double) jum / data.length;
        return rata;
    }

    public static void main(String[] args) {
        int data[] = new int[10];
        int jumlah;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = scan.nextInt();
        }
        jumlah = hitungJumlah(data);
        double rata = hitungRata(data, jumlah);
        System.out.println("Jumlah data = " + jumlah);
        System.out.println("Jumlah data = " + rata);
    }
}
