import java.util.Scanner;
public class Tugas6_1 {
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		int sks[] = new int[10];
		int total=0, i;
		float ipk;
		String matkul[] = new String[10];
		String jenjang;
		System.out.print("Masukkan ipk = ");
		ipk=masuk.nextFloat();
		System.out.print("Masukkan jenjang (D3/S1) = ");
		jenjang=masuk.next();
		if (jenjang.equals("D3")) {
			for (i=1; i<=3; i++) {
				System.out.print("Masukkan mata kuliah = ");
				matkul[i]=input.nextLine();
				System.out.print("Masukkan sks = ");
				sks[i]=masuk.nextInt();
				total += sks[i];
			}
		}
		else if (jenjang.equals("S1")) {
			for (i=1; i<=5; i++) {
				System.out.print("Masukkan mata kuliah = ");
				matkul[i]=input.nextLine();
				System.out.print("Masukkan sks = ");
				sks[i]=masuk.nextInt();
				total += sks[i];
			}
		}
		System.out.println("Total : "+total);
	}
}