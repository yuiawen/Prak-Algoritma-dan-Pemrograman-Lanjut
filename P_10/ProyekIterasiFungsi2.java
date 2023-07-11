import java.util.Scanner;

public class ProyekIterasiFungsi2 {
    public static void cetakUlang(int nUlang, String kalimat) {
        for (int i = 0; i < nUlang; i++) {
            System.out.println(kalimat);
        }
    }

    public static void main(String[] args) {
        int nUlang;
        String kalimat;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kalimat yang ingin dicetak: ");
        kalimat = scan.nextLine();

        System.out.print("Akan dicetak berapa kali: ");
        nUlang = scan.nextInt();

        cetakUlang(nUlang, kalimat);
        scan.close();
    }
}
