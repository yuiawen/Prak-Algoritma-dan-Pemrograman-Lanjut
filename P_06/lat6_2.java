import java.util.Scanner;

public class lat6_2 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan angka bulat (0 - 100) : ");
        nilai = in.nextInt();
        if (nilai >= 60) {
            if (nilai >= 80)
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Nilaimu bagus sekali ");
                }
            else {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Nilaimu bagus ");
                }
            }
        } else {
            if (nilai >= 30)
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Nilaimu kurang ");
                }
            else
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Nilaimu jelek ");
                }
        }
    }
}
