package streams;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxStringFinderTest {

    @Test
    void testFindMaxString() {
        List<String> input = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Grapes");
        String expected = "Orange";

        String result = MaxStringFinder.findMaxString(input);

        assertEquals(expected, result);
    }
}
