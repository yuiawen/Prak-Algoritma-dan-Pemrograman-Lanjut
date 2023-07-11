import java.util.Scanner;

public class Larik9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, x;
        boolean ketemu;
        int data[] = { 12, 20, 14, 9, 34 };

        System.out.print("Masukkan Data yang dicari = ");
        x = input.nextInt();

        ketemu = false;
        for (i = 0; i < data.length; i++) {
            if (data[i] == x) {
                ketemu = true;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Data tersebut ada pada posisi ke-" + (i + 1));
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
