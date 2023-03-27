import java.util.Scanner;

public class Lat1_4 {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int gel;
		String jen, jur;
		System.out.print("Masukkan gelombang (1/2/3) : ");
		gel = in.nextInt();
		System.out.print("Masukkan jenjang (D3/S1) : ");
		jen = in.next();
		System.out.print("Masukkan jurusan : ");
		jur = in.next();
		switch (gel) {
			case 1:
				switch (jen) {
					case "D3":
						switch (jur) {
							case "TK":
							case "KA":
							case "MI":
								System.out.println("SPA gel " + gel + " : Rp. 8.600.000 ");
								break;
							default:
								System.out.println("Salah masukkan jurusan");
						}
						break;
					case "S1":
						switch (jur) {
							case "TI":
								System.out.println("SPA gel " + gel + " : Rp. 13.400.000 ");
								break;
							case "SI":
								System.out.println("SPA gel " + gel + " : Rp. 12.400.000 ");
								break;
							default:
								System.out.println("jurusan tidak terdaftar");
						}
						break;
				}
				break;
			case 2:
				switch (jen) {
					case "D3":
						switch (jur) {
							case "TK":
							case "KA":
							case "MI":
								System.out.println("SPA gel " + gel + " : Rp. 9.100.000 ");
								break;
							default:
								System.out.println("Salah masukkan jurusan");
						}
						break;
					case "S1":
						switch (jur) {
							case "TI":
								System.out.println("SPA gel " + gel + " : Rp. 13.900.000 ");
								break;
							case "SI":
								System.out.println("SPA gel " + gel + " : Rp. 12.900.000 ");
								break;
							default:
								System.out.println("jurusan tidak terdaftar");
						}
						break;
				}
				break;
			case 3:
				switch (jen) {
					case "D3":
						switch (jur) {
							case "TK":
							case "KA":
							case "MI":
								System.out.println("SPA gel " + gel + " : Rp. 9.600.000 ");
								break;
							default:
								System.out.println("Salah masukkan jurusan");
						}
						break;
					case "S1":
						switch (jur) {
							case "TI":
								System.out.println("SPA gel " + gel + " : Rp. 14.400.000 ");
								break;
							case "SI":
								System.out.println("SPA gel " + gel + " : Rp. 13.400.000 ");
								break;
							default:
								System.out.println("jurusan tidak terdaftar");
						}
						break;
				}
				break;
			default:
				System.out.println("Salah masukkan gelombang");
		}
	}
}