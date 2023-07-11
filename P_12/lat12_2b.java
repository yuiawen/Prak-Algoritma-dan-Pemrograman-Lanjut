public class lat12_2b {
    public static void main(String[] args) {
        String str = "Artinya apa bang messi";
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char temp;

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        System.out.print("String Yang Dibalik : ");
        System.out.println(charArray);
    }
}
