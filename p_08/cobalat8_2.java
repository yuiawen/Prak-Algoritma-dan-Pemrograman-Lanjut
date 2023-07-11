import java.util.Scanner;

public class cobalat8_2 {
    public static void inputData(String[] data) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        data[0] = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        data[1] = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin: ");
        data[2] = scanner.nextLine();

        System.out.print("Masukkan Umur: ");
        data[3] = scanner.nextLine();

        System.out.print("Masukkan Alamat: ");
        data[4] = scanner.nextLine();

        scanner.close();
    }

    public static void displayData(String[] data) {
        System.out.println("NIK\t\t: " + data[0]);
        System.out.println("Nama\t\t: " + data[1]);
        System.out.println("Jenis Kelamin\t: " + data[2]);
        System.out.println("Umur\t\t: " + data[3] + " tahun");
        System.out.println("Alamat\t\t: " + data[4]);
    }

    public static void main(String[] args) {
        String[] personalData = new String[5];

        System.out.println("Input Data Pribadi:");
        System.out.println("-------------------------");
        inputData(personalData);

        System.out.println("\nData Pribadi:");
        System.out.println("-------------------------");
        displayData(personalData);
    }
}
