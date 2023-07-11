public class lat12_3b {
    public static int findSmallestElement(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
         int[] array = { 50, 25, 120, -48, 12, 3, 10, -24, 30, 60 };
        System.out.println("Elemen terkecil adalah " + findSmallestElement(array));
    }
}
