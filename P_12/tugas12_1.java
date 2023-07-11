import java.util.Scanner;

public class tugas12_1 {
    public static int pangkat(int A, int B) {
        int hasil = 1;
        for (int i = 0; i < B; i++) {
            hasil *= A;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("||=== MENGHITUNG PERPANGKATAN ===||");
        System.out.print("Masukkan nilai A : ");
        int A = in.nextInt();
        System.out.print("Masukkan nilai B : ");
        int B = in.nextInt();
        in.close();

        System.out.println("===================================");
        int hasil = pangkat(A, B);
        System.out.println("Hasil " + A + " pangkat " + B + " = " + hasil);
    }
}

