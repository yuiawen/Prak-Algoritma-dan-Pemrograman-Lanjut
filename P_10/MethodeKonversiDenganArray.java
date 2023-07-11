import java.util.Scanner;

public class MethodeKonversiDenganArray {
    public static void inputmk(int j) {
        Scanner m = new Scanner(System.in);
        String nmk[] = new String[j];
        int i;
        int jsks[] = new int[j];
        int tsks = 0;
        for (i = 0; i < j; i++) {
            System.out.print("MK ke-" + (i + 1) + " = ");
            nmk[i] = m.nextLine();
            System.out.print("SKS MK ke-" + (i + 1) + " = ");
            jsks[i] = m.nextInt();
            m.nextLine();
            System.out.println();
            tsks = tsks + jsks[i];
        }
        System.out.println("Informasi MK");
        System.out.println("Nama MK\t\t|\t\tSKS");
        for (i = 0; i < j; i++) {
            System.out.println(nmk[i] + "\t\t\t" + jsks[i]);
        }
        System.out.println("Total SKS: " + tsks);
    }

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mata kuliah: ");
        int jmk = m.nextInt();
        m.nextLine();
        inputmk(jmk);
    }
}
