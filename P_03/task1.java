import java.util.Scanner;

public class task1 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Jumlah item belanja : ");
        int jumlah = masuk.nextInt();
        /* input item belanja */
        String[] barang = new String[jumlah];
        int[] harga = new int[jumlah];
        int[] beli = new int[jumlah];
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Barang ke-" + i + " : ");
            System.out.print("Nama Barang : ");
            barang[i - 1] = masuk.next();
            System.out.print("Harga : Rp ");
            harga[i - 1] = masuk.nextInt();
            System.out.print("Jumlah beli : ");
            beli[i - 1] = masuk.nextInt();
            System.out.println();
            System.out.println();
        }
        /* cetak total harga */
        float total = 0;
        for (int i = 1; i <= jumlah; i++) {
            total += harga[i - 1] * beli[i - 1];
        }
        System.out.println("Total Belanja = Rp " + total);
        System.out.print("Bayar = Rp ");
        float bayar = masuk.nextInt();
        float kembali = bayar - total;
        System.out.println("Kembali = Rp " + kembali);
    }
}
