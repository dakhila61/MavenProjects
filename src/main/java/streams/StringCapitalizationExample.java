package streams;

import java.util.Arrays;

public class StringCapitalizationExample {

    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "orange", "grape", "kiwi"};

        // Arrays.stream(strings) creates a stream of Strings.
        // The map operation is used to capitalize the first letter of each String.
        // sorted operation arranges the strings in alphabetical order.
        // forEach method prints each modified string.
        Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .forEach(System.out::println);
    }
}
