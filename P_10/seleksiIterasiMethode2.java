import java.util.Scanner;

public class seleksiIterasiMethode2 {

    public static void konversi(int nilai) {

        if (nilai >= 80 & nilai <= 100) {
            System.out.println("Baik Sekali");
        } else if (nilai >= 61 & nilai <= 79) {
            System.out.println("Baik");
        } else if (nilai >= 41 & nilai <= 60) {
            System.out.println("Cukup");
        } else if (nilai >= 21 & nilai <= 40) {
            System.out.println("Kurang");
        } else {
            System.out.println("Kurang Sekali");
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int n = x.nextInt();
        konversi(n);
    }
}
