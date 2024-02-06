package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsContainingVowels {

    public static void main(String[] args) {
        String[] strings = {"hello", "world", "apple", "banana", "kiwi"};
        printStringsWithVowels(strings);
    }

    public static void printStringsWithVowels(String[] strings) {
        List<String> stringsWithVowels = Arrays.stream(strings)
                .filter(s -> containsVowels(s))
                .collect(Collectors.toList());

        stringsWithVowels.forEach(s -> System.out.println(s + " - " + countVowels(s)));
    }

    private static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    private static long countVowels(String str) {
        return str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
