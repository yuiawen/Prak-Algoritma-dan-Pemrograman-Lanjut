import java.util.Scanner;

public class tugas12_2 {
    public static void main(String[] args) {
        System.out.println("||=== CEK PALINDROME ===||");
        Scanner masukan = new Scanner(System.in);
        String kata, hasilCekKata = "";
        System.out.print("Masukkan Kata/Kalimat : ");
        kata = masukan.nextLine();
        masukan.close();
        kata = kata.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int panjang = kata.length();
        for (int i = panjang - 1; i >= 0; i--) {
            hasilCekKata = hasilCekKata + kata.charAt(i);
        }
        System.out.println("================================");
        if (kata.equals(hasilCekKata)) {
            System.out.println(kata + " adalah Palindrome");
        } else {
            System.out.println(kata + " BUKAN Palindrome");
        }
    }
}

