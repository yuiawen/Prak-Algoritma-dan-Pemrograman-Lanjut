import java.util.Scanner;

public class latihan11_1 {
	public static int pangkat(int A, int B) {
		if (B == 0) {
			return 1;
		} else {
			return A * pangkat(A, B - 1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan nilai A : ");
		int A = in.nextInt();
		System.out.print("Masukkan nilai B : ");
		int B = in.nextInt();
		in.close();
		int hasil = pangkat(A, B);
		System.out.println(A + " pangkat " + B + " = " + hasil);
	}
}
