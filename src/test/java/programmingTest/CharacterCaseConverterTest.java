package programmingTest;

import programming.CharacterCaseConverter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharacterCaseConverterTest {

    @Test
    public void testConvertCase() {
        CharacterCaseConverter converter = new CharacterCaseConverter();

        // Test with all lowercase characters
        String input1 = "hello";
        String expectedOutput1 = "HELLO";
        assertEquals(expectedOutput1, converter.convertCase(input1));

        // Test with all uppercase characters
        String input2 = "WORLD";
        String expectedOutput2 = "world";
        assertEquals(expectedOutput2, converter.convertCase(input2));

        // Test with mixed case characters
        String input3 = "Hello World";
        String expectedOutput3 = "hELLO wORLD";
        assertEquals(expectedOutput3, converter.convertCase(input3));

        // Test with empty string
        String input4 = "";
        String expectedOutput4 = "";
        assertEquals(expectedOutput4, converter.convertCase(input4));

        // Test with special characters
        String input5 = "!@#$%^&*()";
        String expectedOutput5 = "!@#$%^&*()";
        assertEquals(expectedOutput5, converter.convertCase(input5));
    }
}