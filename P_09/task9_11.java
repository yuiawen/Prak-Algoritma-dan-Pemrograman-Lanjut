import java.util.Scanner;

public class task9_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int jumlah = scanner.nextInt();

        int[] numbers = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = calculateSum(numbers);
        double average = calculateAverage(sum, jumlah);

        System.out.println("Jumlah: " + sum);
        System.out.println("Rata-rata: " + average);

        scanner.close();
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static double calculateAverage(int sum, int jumlah) {
        return (double) sum / jumlah;
    }
}
