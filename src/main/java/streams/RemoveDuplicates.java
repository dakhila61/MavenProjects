package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 8, 9, 9);

        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct() // Remove duplicates
                .collect(Collectors.toList()); // Collect the distinct elements into a new list
    }
}

