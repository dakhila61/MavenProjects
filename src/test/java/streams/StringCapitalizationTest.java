package streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCapitalizationTest {

    @Test
    public void testStringCapitalizationAndSorting() {
        List<String> fruits = Arrays.asList("Banana", "Orange", "Kiwi", "Grape", "Apple");

        List<String> expected = Arrays.asList("Apple", "Banana", "Grape", "Kiwi", "Orange");

        List<String> result = fruits.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .collect(Collectors.toList());

        assertEquals(expected, result);
    }
}
