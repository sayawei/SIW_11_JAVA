import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Habr_7_1 {

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new HashSet<>(list);
        return set.stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10);
        List<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}
