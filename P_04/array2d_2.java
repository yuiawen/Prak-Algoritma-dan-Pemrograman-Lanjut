import java.util.Scanner;

public class array2d_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 3;
        int d = 3; // matrik 3 baris 3 kolom

        // Input Matrix A
        System.out.print("Masukan Nilai Matrix A :");
        int[][] matrix1 = new int[b][d];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        // Input Matriks B
        System.out.println("Masukan Nilai Matrix B :");
        int[][] matrix2 = new int[b][d];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // perkalian matrix
        int[][] hasil = new int[b][d];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < d; k++) {
                    hasil[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        // output perkalian
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

}
