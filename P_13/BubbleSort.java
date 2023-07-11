import java.util.Scanner;

public class BubbleSort {
    public void bubbleSort(float larik2[]) {
        for (int i = 0; i < larik2.length; i++) {
            for (int elemen = 0; elemen < larik2.length - 1; elemen++) {
                if (larik2[elemen] > larik2[elemen + 1])
                    tukar(larik2, elemen, elemen + 1);
            }
        }
    }

    public void tukar(float larik3[], int satu, int dua) {
        float temp;
        temp = larik3[satu];
        larik3[satu] = larik3[dua];
        larik3[dua] = temp;
    }

    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        float nilai[] = new float[5];

        System.out.println("Masukkan 5 data nilai:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            nilai[i] = masuk.nextFloat();
        }

        System.out.println("Data nilai yang dimasukkan:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nilai[i]);
        }
        BubbleSort lrk = new BubbleSort();
        lrk.bubbleSort(nilai);
        System.out.println("Data hasil pengurutan:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nilai[i]);
        }
    }
}
