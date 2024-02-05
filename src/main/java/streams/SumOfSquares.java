package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9);

        int sumOfSquares = calculateSumOfSquares(numbers);

        System.out.println("Sum of squares of positive integers: " + sumOfSquares);
    }

    public static int calculateSumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)  // Filter positive numbers
                .mapToInt(n -> n * n) // Square each positive number
                .sum(); // Calculate sum
    }
}

