import java.util.Scanner;

public class denganMethod {

    public static void hitungGaji(int gol, int jam) {
        float gp;
        double gaji;
        switch (gol) {
            case 4:
                gp = 4000000;
                gaji = gp + (jam * 15000);
                System.out.println("Gaji Pokok : " + gp);
                System.out.println("Gaji Lembur : " + jam * 20000);
                System.out.println("Gaji Diterima : " + gaji);
                break;
            case 3:
                gp = 3000000;
                gaji = gp + (jam * 15000);
                System.out.println("Gaji Pokok : " + gp);
                System.out.println("Gaji Lembur : " + jam * 15000);
                System.out.println("Gaji Diterima : " + gaji);
                break;
            case 2:
                gp = 2000000;
                gaji = gp + (jam * 10000);
                System.out.println("Gaji Pokok : " + gp);
                System.out.println("Gaji Lembur : " + jam * 10000);
                System.out.println("Gaji Diterima : " + gaji);
                break;
        }
    }

    // pegawai kontrak
    public static void hitungGaji(int jam) {
        float gaji = 2000000 + (jam * 10000);
        System.out.println("Gaji Pokok : " + 2000000);
        System.out.println("Gaji Lembur : " + jam * 10000);
        System.out.println("Gaji Diterima : " + gaji);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Status Pegawai");
        System.out.println("1. Pegawai Tetap");
        System.out.println("2. Pegawai Kontrak");
        System.out.print("Status : ");
        int s = in.nextInt();

        switch (s) {
            case 1:
                System.out.print("Masukkan Golongan : ");
                int gol = in.nextInt();
                System.out.print("Masukkan jumlah jam lembur : ");
                int jam = in.nextInt();
                hitungGaji(gol, jam);
                break;

            case 2:
                System.out.print("Masukkan jumlah jam lembur : ");
                jam = in.nextInt();
                hitungGaji(jam);
                break;
        }
    }
}
