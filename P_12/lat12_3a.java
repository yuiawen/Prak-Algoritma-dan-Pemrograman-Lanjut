public class lat12_3a {
    public static int findSmallestElement(int[] array, int n) {
        if (n == 1)
            return array[0];
        return Math.min(array[n - 1], findSmallestElement(array, n - 1));
    }

    public static void main(String[] args) {
        int[] array = { 50, 25, 120, -48, 12, 3, 10, -24, 30, 60 };
        int n = array.length;
        System.out.println("Elemen terkecil adalah " + findSmallestElement(array, n));
    }
}

