import java.util.Scanner;

public class seleksiIterasiMethode {

    public static void konversi(String n) {
        switch (n) {
            case "A":
                System.out.println("Baik Sekali");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            case "E":
                System.out.println("Kurang Sekali");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String nilai;
        System.out.print("Masukkan nilai : ");
        nilai = x.nextLine();
        konversi(nilai);
        x.close();
    }
}