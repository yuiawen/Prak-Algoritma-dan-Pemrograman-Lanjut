import java.util.Scanner;

public class tugas10_1 {
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

        // tampil hasil
        i = 0;
        while (i < 10) {
            System.out.println(data[i] + "\t" + keluar[i]);
            i++;
        }
    }

    public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        int i = 0;

        while (i < n) {
            double nilai = x[i];
            char konversi;

            switch ((int) nilai / 20) {
                case 0:
                    konversi = 'E';
                    break;
                case 1:
                    konversi = 'D';
                    break;
                case 2:
                    konversi = 'C';
                    break;
                case 3:
                    konversi = 'B';
                    break;
                default:
                    konversi = 'A';
                    break;
            }

            hasil[i] = konversi;

            hasil[i] = konversi;
            i++;
        }

        return hasil;
    }
}
