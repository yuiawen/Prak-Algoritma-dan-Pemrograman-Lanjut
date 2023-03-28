import java.util.Scanner;

public class NilaiArray {
    public static void main(String[] args) {

        int i, x;
        float total = 0;
        float rata;
        Scanner scan = new Scanner(System.in);
        int[] nilai = { 70, 80, 67, 90, 100 };

        for (i = 0; i < 5; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilai[i]);
        }

        java.util.Arrays.sort(nilai);
        System.out.println("Nilai urut dari yang terkecil ");
        for (i = 0; i < 5; i++) {
            System.out.print(nilai[i] + " ");
        }

        // 100 90 80 70 67

        System.out.println("\nNilai urut dari yang terbesar");
        for (i = (5 - 1); i >= 0; i--) {
            System.out.print(nilai[i] + " ");
        }

        for (i = 0; i < 5; i++) {
            total = total + nilai[i];
        }
        System.out.println("\nTotal= " + total);

        rata = total / 5;
        System.out.println("\n Rata-rata = " + rata);

        System.out.println("\n Max= " + nilai[4]);
        System.out.println("\n Min=" + nilai[0]);
        /*
         * x=nilai[0]; // ==> 70
         * for (i=1;i<5;i++) // ==> 80
         * {
         * if(nilai[i]>x)
         * x=nilai[i];
         * }
         * System.out.print("\nNilai terbesar = "+x);
         * System.out.println("\n");
         */

    }
}