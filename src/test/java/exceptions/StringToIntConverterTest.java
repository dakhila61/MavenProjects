package exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringToIntConverterTest {

    @Test
    void testConvertStringToInt() {
        assertEquals(23, StringToIntConverter.convertStringToInt("23"));
        assertEquals(0, StringToIntConverter.convertStringToInt("0"));
        assertEquals(-45, StringToIntConverter.convertStringToInt("-45"));
        assertEquals(1000, StringToIntConverter.convertStringToInt("1000"));
    }

    @Test
    void testConvertStringToIntWithNonIntegerInput() {
        assertThrows(NumberFormatException.class, () -> StringToIntConverter.convertStringToInt("45.67"));
        assertThrows(NumberFormatException.class, () -> StringToIntConverter.convertStringToInt("test"));
        assertThrows(NumberFormatException.class, () -> StringToIntConverter.convertStringToInt("123f"));
    }
}
