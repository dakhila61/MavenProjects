package streams;

import java.util.Arrays;

public class AverageOfSquares {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double averageOfSquares = calculateAverageOfSquares(numbers);

        System.out.println("Average of squares of odd numbers: " + averageOfSquares);
    }

    public static double calculateAverageOfSquares(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2)) // Square each odd number
                .average() // Calculate average
                .orElse(0.0); // Default value if no odd numbers are present
    }
}

