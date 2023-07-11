public class lat12_2a {
    public static void reverse(char[] array, int start, int end) {
        if (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverse(array, start + 1, end - 1);
        }
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        reverse(charArray, 0, charArray.length - 1);
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String input = "Artinya apa bang messi";
        String reversedString = reverseString(input);
        System.out.println("String Yang Dibalik : " + reversedString);
    }
}
