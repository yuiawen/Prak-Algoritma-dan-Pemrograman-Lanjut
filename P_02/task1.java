public class task1 {
    public static void main(String[] args) {
        int i, j, k, x, y;
        i = 1;
        k = 5;
        while (i <= k) {
            j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        x = k - 1;
        while (x >= 1) {
            y = 1;
            while (y <= x) {
                System.out.print(y + " ");
                y++;
            }
            System.out.println();
            x--;
        }
    }
}
