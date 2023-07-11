import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits); // create List
        System.out.printf("Unsorted array elements: %s\n", list);

        // sort arraylist
        Collections.sort(list);

        // output list elements
        System.out.printf("Sorted array elements: %s\n", list);
    }
}
