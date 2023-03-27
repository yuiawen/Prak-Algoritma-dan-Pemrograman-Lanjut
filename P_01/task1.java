import java.util.Scanner;
public class task1 {
	public static void main (String arg[]) {
		Scanner in=new Scanner(System.in);
		int bln, thn;
		System.out.print("Masukkan bulan(1-12): ");
		bln=in.nextInt();
		switch(bln)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print("31 Hari");
			break;
			case 2:
				System.out.print("Tahun :");
				thn = in.nextInt();
				if(thn%4==0){
					System.out.print("29 hari");
				}else{
					System.out.print("28 hari");
			}
				break;
			case 4: case 6: case 9: case 11:
				System.out.print("30 Hari");
				break;
			default:
			System.out.print("Salah bulan");
		}
	}
}
