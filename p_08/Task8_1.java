import java.util.Scanner;

public class Task8_1 {
    Scanner input = new Scanner(System.in);

    int diskon, totalBayar, potongan, jangkaWaktu, jumlahPembayaran, bayar, harga, jenisPembayaran;

    public void inputData() {

        // input harga dan pilihan
        System.out.print("Harga Kendaraan: Rp ");
        harga = input.nextInt();
        System.out.println("Jenis Pembayaran : \n1. Kredit \n2. Cash ");
        System.out.print("Pilihan : ");
        jenisPembayaran = input.nextInt();

    }

    public void hitungAngsuran() {
        if (jenisPembayaran == 1) {

            System.out.print("Jangka Waktu Pembayaran (bulan): ");
            jangkaWaktu = input.nextInt();
            System.out.print("Diskon (persen): ");
            diskon = input.nextInt();
            potongan = (diskon / 100) * harga;
            jumlahPembayaran = harga - potongan;
            System.out.println("Jumlah Pembayaran : Rp " + jumlahPembayaran);
            System.out.println("-------------------------------------------------");
            System.out.println("|\t" + "Angsuran ke" + "\t|" + "\t Jumlah" + "\t\t|");
            System.out.println("-------------------------------------------------");
            for (int i = 1; i <= jangkaWaktu; i++) {
                totalBayar = jumlahPembayaran / jangkaWaktu;
                System.out.println("|\t" + "    " + i + "\t\t|" + "\tRp " + totalBayar + "\t|");
            }
            System.out.println("-------------------------------------------------");
        } else if (jenisPembayaran == 2) {
            System.out.print("Diskon (persen): ");
            diskon = input.nextInt();
            potongan = (diskon / 100) * harga;
            jumlahPembayaran = harga - potongan;
            System.out.println("-------------------------------");
            System.out.println("Jumlah Pembayaran : Rp " + jumlahPembayaran);
            System.out.print("Bayar \t\t  : Rp ");
            bayar = input.nextInt();
            totalBayar = jumlahPembayaran - bayar;
            System.out.println("Sisa Pembayaran   : Rp " + totalBayar);
            System.out.println("-------------------------------");
        } else {
            System.out.println("Jenis Pembayaran Tidak Valid");
        }

    }

    public static void main(String[] args) {
        Task8_1 u = new Task8_1();
        u.inputData();
        u.hitungAngsuran();
    }
}
