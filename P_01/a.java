import java.util.Scanner;
public class a{
public static void main (String arg[]){
Scanner in=new Scanner(System.in);
int tinggi;
System.out.print("Masukkan tinggi Anda : ");
tinggi=in.nextInt();
if(tinggi>165)
System.out.println("Lolos");
else
System.out.println("Gagal");
}
}
