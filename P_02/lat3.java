public class lat3 {
     public static void main(String[] args) {
          int i, j;
          System.out.println("Pengulangan Bersarang Membentuk Pola");
          for (i = 5; i >= 1; i--) {
               for (j = 0; j <= 5 - i; j++)
                    System.out.print(" ");
               for (j = 0; j <= i - 1; j++)
                    System.out.print("*");
               if (i <= j) {
                    System.out.println("akakom ");
               }
          }
     }
}
