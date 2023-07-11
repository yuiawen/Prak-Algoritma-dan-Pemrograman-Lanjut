import java.util.Scanner;

public class task9_22 {
    static Scanner masuk = new Scanner(System.in);
    static float total;
    static String[] barang;
    static int[] harga;
    static int[] jual;

    public static void inputBarang() {
        System.out.print("Jumlah penjualan barang: ");
        int jumlah = masuk.nextInt();
        barang = new String[jumlah];
        harga = new int[jumlah];
        jual = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Barang ke-" + (i + 1) + " : ");
            System.out.print("Nama Barang: ");
            barang[i] = masuk.next();
            System.out.print("Harga: Rp ");
            harga[i] = masuk.nextInt();
            System.out.print("Jumlah terjual: ");
            jual[i] = masuk.nextInt();
            System.out.println();

        }
    }

    public static void hitungTotal(int jumlah, int[] jual, int[] harga) {
        total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += harga[i] * jual[i];
        }
    }

    public static void cetakTotal() {
        System.out.println("====== Nota Penjualan ======");
        for (int i = 0; i < barang.length; i++) {
            System.out.println("Nama Barang\t: " + barang[i]);
            System.out.println("Harga Barang\t: Rp " + harga[i]);
            System.out.println("Jumlah Barang\t: " + jual[i]);
            System.out.println("============================");
        }
        System.out.println("Total Harga: Rp " + total);
    }

    public static void main(String args[]) {
        inputBarang();
        hitungTotal(barang.length, jual, harga);
        cetakTotal();
    }
}
