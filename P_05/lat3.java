public class lat3 {
    public static void main(String[] args) {
        int[][][] array = { { { 0, 0, 0 }, { 0, 0, 1 } }, { { 0, 1, 0 }, { 0, 1, 1 } }, { { 1, 0, 0 }, { 1, 0, 1 } },
                { { 1, 1, 0 }, { 1, 1, 1 } } };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    System.out.print(array[i][j][k] + " | ");
                }
                System.out.println();
            }
        }
    }
}
