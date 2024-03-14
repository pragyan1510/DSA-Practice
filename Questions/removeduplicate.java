import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeduplicate {
    public static List<Integer> removeDuplicates(List<Integer> myList) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer element : myList) {
            if (uniqueElements.add(element)) { // add returns true if the element is not already present
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 1));
        List<Integer> result = removeDuplicates(myList);
        System.out.println("Original List: " + myList);
        System.out.println("List with Duplicates Removed: " + result);
    }
}
