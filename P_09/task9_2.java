import java.util.Scanner;

public class task9_2 {
    public static void main(String[] args) {
        // Creating a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Calling the inputBarang method to get item information from the user
        String namaBarang = inputBarang("Nama Barang", scanner);
        int hargaBarang = inputHarga("Harga Barang", scanner);
        int jumlahBarang = inputJumlah("Jumlah Barang", scanner);

        // Calling the hitungTotal method to calculate the total price
        int totalHarga = hitungTotal(hargaBarang, jumlahBarang);

        // Calling the cetakNota method to print the sales receipt
        cetakNota(namaBarang, hargaBarang, jumlahBarang, totalHarga);
    }

    // Method to get input for item information from the user
    public static String inputBarang(String label, Scanner scanner) {
        System.out.print("Masukkan " + label + ": ");
        return scanner.nextLine();
    }

    // Method to get input for item price from the user
    public static int inputHarga(String label, Scanner scanner) {
        System.out.print("Masukkan " + label + ": ");
        return scanner.nextInt();
    }

    // Method to get input for item quantity from the user
    public static int inputJumlah(String label, Scanner scanner) {
        System.out.print("Masukkan " + label + ": ");
        return scanner.nextInt();
    }

    // Method to calculate the total price
    public static int hitungTotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    // Method to print the sales receipt
    public static void cetakNota(String namaBarang, int hargaBarang, int jumlahBarang, int totalHarga) {
        System.out.println("==== Nota Penjualan ====");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("========================");
    }
}
