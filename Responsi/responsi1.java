import java.util.Scanner;

public class responsi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim, nama, prodi;
        int jumlahSksPraktik, jumlahSksTeori;

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

        String[] listProdi = { "Informatika", "Sistem Informasi", "RPL", "TK", "Bisnis Digital" };
        int[] sppTetap = { 1500000, 1500000, 1200000, 1200000, 1200000 };
        int[] biayaSksTeori = { 100000, 100000, 100000, 100000, 100000 };
        int[] biayaSksPraktik = { 150000, 150000, 150000, 150000, 150000 };

        char cobaLagi = 'y';
        for (; cobaLagi == 'y' || cobaLagi == 'Y';) {
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
            int j = -1;
            for (int i = 0; i < listProdi.length; i++) {
                if (listProdi[i].equalsIgnoreCase(prodi)) {
                    j = i;
                    break;
                }
            }

            if (j != -1) {
                int spp = sppTetap[j];
                int biayaTeori = jumlahSksTeori * biayaSksTeori[j];
                int biayaPraktik = jumlahSksPraktik * biayaSksPraktik[j];
                int total = spp + biayaTeori + biayaPraktik;
                System.out.println();
                System.out.println("Informasi Pembayaran");
                System.out.println("NIM : " + nim);
                System.out.println("Nama : " + nama);
                System.out.println("Prodi : " + prodi);
                System.out.println("SPP Tetap : " + spp);
                System.out.println("Biaya SKS Teori : " + biayaTeori);
                System.out.println("Biaya SKS Praktik : " + biayaPraktik);
                System.out.println("Total Biaya : " + total);
            } else {
                System.out.println("Salah memasukkan prodi");
            }
            System.out.println();
            System.out.print("Coba Lagi? (y/t): ");
            cobaLagi = input.next().charAt(0);
            input.nextLine();
            input.close();
        }

    }
}
