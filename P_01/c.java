import java.util.Scanner;
public class c{
public static void main (String arg[]){
Scanner in=new Scanner(System.in);
int nilai;
System.out.print("Masukkan Nilai : ");
nilai=in.nextInt();
if(nilai>=80)
System.out.println("Nilai A");
else
System.out.println("Belum ada keterangan");
}
}
