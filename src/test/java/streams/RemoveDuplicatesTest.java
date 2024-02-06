package streams;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 8, 9, 9);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> uniqueNumbers = RemoveDuplicates.removeDuplicates(numbers);

        assertEquals(expected, uniqueNumbers);
    }

    @Test
    void testRemoveDuplicatesEmptyList() {
        List<Integer> numbers = Arrays.asList();
        List<Integer> expected = Arrays.asList();

        List<Integer> uniqueNumbers = RemoveDuplicates.removeDuplicates(numbers);

        assertEquals(expected, uniqueNumbers);
    }

    @Test
    void testRemoveDuplicatesNoDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> uniqueNumbers = RemoveDuplicates.removeDuplicates(numbers);

        assertEquals(expected, uniqueNumbers);
    }
}

