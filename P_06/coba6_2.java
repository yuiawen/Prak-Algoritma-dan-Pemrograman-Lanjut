import java.util.Scanner;

public class coba6_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String jenjang;
        String[] mk = new String[10];
        int[] sks = new int[10];
        int total = 0;
        System.out.print("Masukkan jenjang D3/S1 : ");
        jenjang = in.next();
        if (jenjang.equals("D3")) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Masukkan mata kuliah = ");
                mk[i] = in.nextLine();
                in.nextLine();
                System.out.print("Masukkan sks = ");
                sks[i] = in.nextInt();
                total = total + sks[i];
            }
            System.out.println("Total sks = " + total);
        } else {
            if (jenjang.equals("S1")) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print("Masukkan mata kuliah = ");
                    mk[i] = in.nextLine();
                    System.out.print("Masukkan sks = ");
                    sks[i] = in.nextInt();
                    total += total + sks[i];
                }
                System.out.println("Total sks = " + total);
            }
        }
    }
}