package streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class StringsContainingVowelsTest {

    @Test
    void testPrintStringsWithVowels() {
        String[] strings = {"hello", "world", "apple", "banana", "kiwi"};
        String expectedOutput = "hello - 2\r\nworld - 1\r\napple - 2\r\nbanana - 3\r\nkiwi - 2\r\n";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StringsContainingVowels.printStringsWithVowels(strings);
        String actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);


    }
}
