import java.util.Scanner;

public class task9_1 {
    public static int pertambahan(int num1, int num2) {
        return Math.addExact(num1, num2);
    }

    public static int pengurangan(int num1, int num2) {
        return Math.subtractExact(num1, num2);
    }

    public static int perkalian(int num1, int num2) {
        return Math.multiplyExact(num1, num2);
    }

    public static double pembagian(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void cetakHasil(int jumlah, int selisih, int hasilKali, double hasilBagi) {
        System.out.println("Jumlah\t\t : " + jumlah);
        System.out.println("Selisih\t\t : " + selisih);
        System.out.println("Hasil Kali\t : " + hasilKali);
        System.out.println("Hasil bagi\t : " + hasilBagi);

    }

    public static void main(String[] args) {
        // input dua angka dari pengguna
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int num1 = in.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int num2 = in.nextInt();

        // perhitungan menggunakan metode bawaan Java
        int jumlah = pertambahan(num1, num2);
        int selisih = pengurangan(num1, num2);
        int hasilKali = perkalian(num1, num2);
        double hasilBagi = pembagian(num1, num2);

        // hasil perhitungan
        cetakHasil(jumlah, selisih, hasilKali, hasilBagi);
        in.close();
    }
}
