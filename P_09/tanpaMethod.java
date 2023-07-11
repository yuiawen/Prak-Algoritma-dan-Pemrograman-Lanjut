import java.util.Scanner;

public class tanpaMethod {
    public static void main(String[] args) {
        float gp;
        double gaji;
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
                System.out.println("Masukkan jumlah jam lembur : ");
                int jam = in.nextInt();

                switch (gol) {
                    case 4:
                        gp = 4000000;
                        gaji = gp + (jam * 15000);
                        System.out.println("Gaji Pokok : " + gp);
                        System.out.println("Gaji Lembur : " + jam * 15000);
                        System.out.println("Gaji Diterima : " + gaji);
                        break;
                    case 3:
                        gp = 3000000;
                        gaji = gp + (jam * 15000);
                        System.out.println("Gaji Pokok : " + gp);
                        System.out.println("Gaji Lembur : " + jam * 15000);
                        System.out.println("Gaji Diterima : " + gaji);
                        break;

                }
                break;

            case 2:
                gp = 2000000;
                System.out.println("Masukkan jumlah jam lembur : ");
                jam = in.nextInt();
                gaji = gp + (jam * 10000);
                System.out.println("Gaji Pokok : " + gp);
                System.out.println("Gaji Lembur : " + jam * 10000);
                System.out.println("Gaji Diterima : " + gaji);
                break;
        }
    }
}