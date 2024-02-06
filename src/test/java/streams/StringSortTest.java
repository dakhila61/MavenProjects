package streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringSortTest {

    @Test
    void testSortStrings() {
        String[] strings = {"apple", "banana", "kiwi", "orange"};
        String[] expected = {"kiwi", "apple", "orange", "banana"};

        StringSort.sortStrings(strings);

        assertArrayEquals(expected, strings);
    }
}
