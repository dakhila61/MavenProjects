package streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class StreamExampleTest {

    @Test
    void testFilterAndDoubleOddNumbers() {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedOutput = Arrays.asList(2, 6, 10, 14, 18);

        List<Integer> actualOutput = StreamExample.filterAndDoubleOddNumbers(inputNumbers);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFilterAndDoubleOddNumbersEmptyList() {
        List<Integer> inputNumbers = Arrays.asList();
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> actualOutput = StreamExample.filterAndDoubleOddNumbers(inputNumbers);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFilterAndDoubleOddNumbersNoOddNumbers() {
        List<Integer> inputNumbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> actualOutput = StreamExample.filterAndDoubleOddNumbers(inputNumbers);

        assertEquals(expectedOutput, actualOutput);
    }
}
