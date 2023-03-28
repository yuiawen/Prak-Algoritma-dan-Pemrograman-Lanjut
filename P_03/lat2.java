import java.util.Scanner;

public class lat2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, jurusan;

        // input data
        System.out.println("================================");
        System.out.println("   Menghitung Nilai Mahasiswa   ");
        System.out.println("================================");
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jumlah = in.nextInt();
        System.out.println("================================");
        System.out.print("Nama : ");
        nama = in.next();
        System.out.print("NIM : ");
        nim = in.next();
        System.out.print("Jurusan : ");
        jurusan = in.next();
        System.out.println("================================");

        // input nilai
        String[] mk = new String[jumlah];
        String[] grade = new String[jumlah];
        int[] uts = new int[jumlah];
        int[] uas = new int[jumlah];
        double[] nilai = new double[jumlah];
        for (int a = 0; a < jumlah; a++) {
            System.out.print("Mata Kuliah ke-" + (a + 1) + " : ");
            mk[a] = in.next();
            System.out.print("Nilai UTS : ");
            uts[a] = in.nextInt();
            System.out.print("Nilai UAS : ");
            uas[a] = in.nextInt();
            System.out.println();
            // hitung rata-rata dan grade nilai
            nilai[a] = ((uts[a] * 0.7) + (uas[a] * 0.3));
            if (nilai[a] >= 90) {
                grade[a] = "A";
            } else if (nilai[a] >= 70) {
                grade[a] = "B";
            } else if (nilai[a] >= 60) {
                grade[a] = "C";
            } else if (nilai[a] >= 50) {
                grade[a] = "D";
            } else {
                grade[a] = "E";
            }
        }
        // cetak nilai
        System.out.println("==================================");
        System.out.println("Nama : " + nama + "\t NPM : " + nim);
        System.out.println("==================================");
        System.out.println("Mata Kuliah\t Nilai\t Grade");
        System.out.println("==================================");
        for (int a = 0; a < jumlah; a++) {
            System.out.println(mk[a] + " \t" + nilai[a] + " \t" + grade[a]);
        }

    }
}