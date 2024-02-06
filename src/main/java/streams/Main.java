package streams;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Implementing addition using lambda expression
        MathOperation addition = (a, b) -> a + b;

        // Test the addition operation
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);  // Output: Result of addition: 8
    }
}
