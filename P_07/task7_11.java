public class task7_11 {
    public static void main(String[] args) {
        int a = 6;
        int[] deret = new int[a];

        deret[0] = 1;
        deret[1] = 2;
        for (int i = 2; i < a; i++) {
            if (i == 2) {
                deret[i] = deret[0] + deret[1];
            } else if (i == 3) {
                deret[i] = deret[2];
            } else if (i == 4) {
                deret[i] = deret[3] + 1;
            } else if (i == 5) {
                deret[i] = deret[3] + deret[4];
            }
        }

        for (int i = 0; i < a; i++) {
            System.out.print(deret[i] + " ");
        }
    }
}
