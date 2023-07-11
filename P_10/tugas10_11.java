import java.util.Scanner;

public class tugas10_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char[] keluar = new char[10];
        int i = 0;

        while (i < 10) {
            System.out.print("data ke-" + (i + 1) + ": ");
            data[i] = scan.nextDouble();
            i++;
        }

        System.out.println("======================");
        System.out.println("|   Hasil Konversi   |");
        System.out.println("======================");
        keluar = konversiNilai(data);
        i = 0;
        while (i < 10) {
            System.out.println(data[i] + "\t" + keluar[i]);
            i++;
        }
        scan.close();
    }

    public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        int i = 0;

        while (i < n) {

            if (x[i] > 80 && x[i] <= 100) {
                hasil[i] = 'A';
            } else if (x[i] > 60 && x[i] <= 80) {
                hasil[i] = 'B';
            } else if (x[i] > 40 && x[i] <= 60) {
                hasil[i] = 'C';
            } else if (x[i] > 20 && x[i] <= 40) {
                hasil[i] = 'D';
            } else {
                hasil[i] = 'E';
            }
            i++;
        }

        return hasil;
    }
}
