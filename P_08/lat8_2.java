import java.util.Scanner;

public class lat8_2 {
    String nama, jenisKelamin, alamat;
    int nik, umur;

    public void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NIK: ");
        nik = in.nextInt();
        in.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = in.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        jenisKelamin = in.nextLine();
        System.out.print("Masukkan Umur: ");
        umur = in.nextInt();
        in.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamat = in.nextLine();
        System.out.println();
        in.close();
    }

    public void cetakData() {
        System.out.println("NIK\t\t: " + nik);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenisKelamin);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Alamat\t\t: " + alamat);
    }

    public static void main(String[] args) {
        lat8_2 U = new lat8_2();
        U.inputData();
        U.cetakData();
    }
}
