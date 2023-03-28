import java.util.Scanner;

public class p_03 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        float total, rata;
        System.out.print("Jumlah mahasiswa : ");
        int jumlah = masuk.nextInt();
        // input nilai
        int[] nilai = new int[jumlah];
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + "= ");
            nilai[i - 1] = masuk.nextInt();
        }
        System.out.println();
        System.out.println();
        // cetak nilai
        total = 0;
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + "=" + nilai[i - 1]);
            total = total + nilai[i - 1];
        }
        rata = total / jumlah;
        System.out.println("Total data = " + total);
        System.out.println("Rata-rata = " + rata);
    }
}