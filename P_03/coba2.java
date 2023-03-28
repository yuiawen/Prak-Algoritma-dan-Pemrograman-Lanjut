import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println(" Menghitung Nilai Mahasiswa ");
        System.out.println("==================================");

        // Input data mahasiswa
        System.out.print(" Masukan Jumlah Mata Kuliah: ");
        int jumlahMataKuliah = input.nextInt();

        System.out.println("==================================");
        System.out.print(" Nama : ");
        String nama = input.next();
        System.out.print(" NIM : ");
        String nim = input.next();
        System.out.print(" Jurusan : ");
        String jurusan = input.next();

        // Input nilai mata kuliah
        double[] nilaiUTS = new double[jumlahMataKuliah];
        double[] nilaiUAS = new double[jumlahMataKuliah];
        String[] namaMataKuliah = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("==================================");
            System.out.println("Mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            namaMataKuliah[i] = input.next();
            System.out.print("Nilai UTS : ");
            nilaiUTS[i] = input.nextDouble();
            System.out.print("Nilai UAS : ");
            nilaiUAS[i] = input.nextDouble();
        }

        System.out.println("==================================");
        System.out.println("Nama : " + nama + " NPM : " + nim);
        System.out.println("==================================");
        System.out.println("Mata Kuliah\tNilai\tGrade");
        System.out.println("==================================");

        // Hitung nilai akhir dan grade untuk setiap mata kuliah
        double totalNilaiAkhir = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            double nilaiAkhir = (nilaiUTS[i] + nilaiUAS[i]) / 2;
            totalNilaiAkhir += nilaiAkhir;
            String grade = hitungGrade(nilaiAkhir);
            System.out.println(namaMataKuliah[i] + "\t" + nilaiAkhir + "\t" + grade);
        }

        // Hitung nilai rata-rata
        double rataRata = totalNilaiAkhir / jumlahMataKuliah;

        // Cetak nilai rata-rata dan grade
        String gradeAkhir = hitungGrade(rataRata);
        System.out.println("==================================");
        System.out.println("Nilai Rata-Rata : " + rataRata);
        System.out.println("Grade Akhir : " + gradeAkhir);
        System.out.println("==================================");
    }

    // Method untuk menghitung grade berdasarkan nilai
    public static String hitungGrade(double nilai) {
        String grade = "";
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        return grade;
    }
}