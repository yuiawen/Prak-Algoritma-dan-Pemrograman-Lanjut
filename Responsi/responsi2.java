import java.util.Scanner;

public class responsi2 {
    String nim;
    String nama;
    String prodi;
    int jumlahSksPraktik;
    int jumlahSksTeori;

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Prodi : ");
        prodi = input.nextLine();
        System.out.print("Masukkan Jumlah SKS Praktik : ");
        jumlahSksPraktik = input.nextInt();
        System.out.print("Masukkan Jumlah SKS Teori : ");
        jumlahSksTeori = input.nextInt();
    }

    public int hitungBiaya(String prodi) {
        String[] listProdi = { "Informatika", "Sistem Informasi", "RPL", "TK", "Bisnis Digital" };
        int[] sppTetap = { 1500000, 1500000, 1200000, 1200000, 1200000 };
        int j = -1;

        for (int i = 0; i < listProdi.length; i++) {
            if (listProdi[i].equalsIgnoreCase(prodi)) {
                j = i;
                break;
            }
        }

        if (j != -1) {
            return sppTetap[j];
        } else {
            return -1; // Prodi tidak valid
        }
    }

    public void mencetakData(int spp, int biayaSksTeori, int biayaSksPraktik, int total) {
        System.out.println();
        System.out.println("Informasi Pembayaran");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("SPP Tetap : " + spp);
        System.out.println("Biaya SKS Teori : " + biayaSksTeori);
        System.out.println("Biaya SKS Praktik : " + biayaSksPraktik);
        System.out.println("Total Biaya : " + total);
    }

    public static void main(String[] args) {
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\tProdi \t\t\t|\t SPP Tetap \t|\t Variabel Teori \t|\t Variabel Praktik \t|");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\tInformatika \t\t|\t 1500000 \t|\t 100000 \t\t|\t 150000\t\t\t|");
        System.out.println("|\tSistem Informasi\t|\t 1500000 \t|\t 100000 \t\t|\t 150000\t\t\t|");
        System.out.println("|\tRPL \t\t\t|\t 1200000 \t|\t 100000 \t\t|\t 150000\t\t\t|");
        System.out.println("|\tTK \t\t\t|\t 1200000 \t|\t 100000 \t\t|\t 150000\t\t\t|");
        System.out.println("|\tBisnis Digital \t\t|\t 1200000 \t|\t 100000 \t\t|\t 150000\t\t\t|");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        responsi2 pembayaran = new responsi2();
        Scanner input = new Scanner(System.in);
        char cobaLagi = 'y';

        for (; cobaLagi == 'y' || cobaLagi == 'Y';) {
            pembayaran.inputData();

            int spp = pembayaran.hitungBiaya(pembayaran.prodi);
            if (spp != -1) {
                int biayaSksTeori = pembayaran.jumlahSksTeori * 100000;
                int biayaSksPraktik = pembayaran.jumlahSksPraktik * 150000;
                int total = spp + biayaSksTeori + biayaSksPraktik;

                pembayaran.mencetakData(spp, biayaSksTeori, biayaSksPraktik, total);
            } else {
                System.out.println("Salah memasukkan prodi");
            }
            System.out.println();
            System.out.print("Coba Lagi? (y/t): ");
            cobaLagi = input.next().charAt(0);
            input.nextLine();
        }

        input.close();
    }
}
