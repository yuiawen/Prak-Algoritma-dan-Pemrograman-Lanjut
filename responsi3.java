import java.util.Scanner;

public class responsi3 {
    private String nim;
    private String nama;
    private String prodi;
    private int jumlahSksPraktik;
    private int jumlahSksTeori;

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nim : ");
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

    public int hitungBiayaSpp(String prodi) {
        String[] prodiList = { "Informatika", "Sistem Informasi", "RPL", "TK", "Bisnis Digital" };
        int[] sppTetap = { 1500000, 1500000, 1200000, 1200000, 1200000 };
        int index = -1;

        for (int i = 0; i < prodiList.length; i++) {
            if (prodiList[i].equalsIgnoreCase(prodi)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            return sppTetap[index];
        } else {
            return -1;
        }
    }

    public void cetakData(int spp, int biayaTeori, int biayaPraktik, int totalBiaya) {
        System.out.println();
        System.out.println("Informasi Pembayaran");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("SPP Tetap : " + spp);
        System.out.println("Biaya SKS Teori : " + biayaTeori);
        System.out.println("Biaya SKS Praktik : " + biayaPraktik);
        System.out.println("Total Biaya : " + totalBiaya);
        System.out.println();
    }

    public static void main(String[] args) {
        responsi3 pembayaran = new responsi3();
        Scanner input = new Scanner(System.in);
        char cobaLagi;

        do {
            pembayaran.inputData();

            int spp = pembayaran.hitungBiayaSpp(pembayaran.prodi);
            if (spp != -1) {
                int biayaTeori = pembayaran.jumlahSksTeori * 100000;
                int biayaPraktik = pembayaran.jumlahSksPraktik * 150000;
                int totalBiaya = spp + biayaTeori + biayaPraktik;

                pembayaran.cetakData(spp, biayaTeori, biayaPraktik, totalBiaya);
            } else {
                System.out.println("Salah memasukkan prodi");
            }

            System.out.print("Coba Lagi? (y/t): ");
            cobaLagi = input.next().charAt(0);
            input.nextLine(); // Membersihkan karakter baru setelah input angka
        } while (cobaLagi == 'y' || cobaLagi == 'Y');

        input.close();
    }
}
