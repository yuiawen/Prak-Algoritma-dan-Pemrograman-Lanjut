import java.util.Scanner;

public class prak6 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        float nilai[] = new float[5];
        float total, rata, max, min;
        System.out.println("Masukkan 5 buah data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " : ");
            nilai[i] = masuk.nextFloat();
        }
        System.out.println("Data nilai yang dimasukkan");
        for (int i = 0; i < 5; i++) {
            System.out.println(nilai[i]);
        }
        total = 0;
        max = nilai[0];
        min = nilai[0];
        for (int i = 0; i < 5; i++) {
            total = total + nilai[i];
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        rata = total / 5;
        System.out.println("Total data = " + total);
        System.out.println("Rata-rata = " + rata);
        System.out.println("Bilangan maksimum = " + max);
        System.out.println("Bilangan minimum = " + min);
    }
}