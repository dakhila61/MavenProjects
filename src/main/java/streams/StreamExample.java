package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> doubledOddNumbers = filterAndDoubleOddNumbers(numbers);

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Doubled Odd Numbers: " + doubledOddNumbers);
    }

    public static List<Integer> filterAndDoubleOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)      // Filter out even numbers
                .map(n -> n * 2)              // Double each remaining number
                .collect(Collectors.toList()); // Collect the results into a new list
    }
}
