import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int i, bayar, kembali;

        System.out.print("Jumlah Item Belanja  : ");
        int jumlah = input.nextInt();
        int[] harga = new int[jumlah];
        int[] banyak = new int[10];
        int[] ttl = new int[10];
        String[] nmabrg = new String[10];
        for (i = 1; i <= jumlah; i++) {
            System.out.println("Barang ke-" + i);
            System.out.print("Nama Barang = ");
            nmabrg[i - 1] = input.next();
            System.out.print("Harga = ");
            harga[i - 1] = input.nextInt();
            System.out.print("Jumlah Beli = ");
            banyak[i - 1] = input.nextInt();
            ttl[i - 1] = harga[i - 1] * banyak[i - 1];
            total = total + ttl[i - 1];
            System.out.println();
            System.out.println();
        }
        System.out.println("=============");
        System.out.println("Total Belanja = Rp" + total);
        System.out.print("Bayar = Rp");
        bayar = input.nextInt();
        kembali = bayar - total;
        System.out.println("Total Belanja = Rp" + kembali);
    }
}