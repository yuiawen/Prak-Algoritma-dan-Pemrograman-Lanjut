import java.util.Scanner;

public class Lat1_3 {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int gel;
		String jen, jur;
		System.out.print("Masukkan gelombang (1/2) : ");
		gel = in.nextInt();
		System.out.print("Masukkan jenjang (D3/S1) : ");
		jen = in.next();
		System.out.print("Masukkan jurusan : ");
		jur = in.next();
		if (gel == 1) {
			if (jen.equals("D3")) {
				if (jur.equals("TK"))
					System.out.println("SPA gel " + gel + " : Rp. 8.600.000 ");
				else if (jur.equals("KA"))
					System.out.println("SPA gel " + gel + " : Rp. 8.600.000 ");
				else if (jur.equals("MI"))
					System.out.println("SPA gel " + gel + " : Rp. 8.600.000 ");
				else
					System.out.println("Salah memasukkan jurusan");
			} else {
				if (jur.equals("TI"))
					System.out.println("SPA gel " + gel + " : Rp. 13.400.000 ");
				else if (jur.equals("SI"))
					System.out.println("SPA gel " + gel + " : Rp. 12.400.000 ");
				else
					System.out.println("jurusan tidak terdaftar");
			}
		} else if (gel == 2) {
			if (jen.equals("D3")) {
				if (jur.equals("TK"))
					System.out.println("SPA gel " + gel + " : Rp. 9.100.000 ");
				else if (jur.equals("KA"))
					System.out.println("SPA gel " + gel + " : Rp. 9.100.000 ");
				else if (jur.equals("MI"))
					System.out.println("SPA gel " + gel + " : Rp. 9.100.000 ");
				else
					System.out.println("Salah memasukkan jurusan");
			} else {
				if (jur.equals("TI"))
					System.out.println("SPA gel " + gel + " : Rp. 13.900.000 ");
				else if (jur.equals("SI"))
					System.out.println("SPA gel " + gel + " : Rp. 12.900.000 ");
				else
					System.out.println("jurusan tidak terdaftar");
			}
		} else
			System.out.println("Salah memasukkan gelombang");
	}
}
