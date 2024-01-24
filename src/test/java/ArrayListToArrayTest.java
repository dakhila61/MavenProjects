import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;

public class ArrayListToArrayTest {

    @Test
    public void testArrayListToArrayConversion() {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");

        // Convert ArrayList to array
        String[] expectedArray = {"Java", "Python", "JavaScript"};
        String[] actualArray = arrayList.toArray(new String[0]);

        // Check if the arrays are equal
        assertArrayEquals(expectedArray, actualArray);
    }
}
