import collections.RemoveLastObjectExample;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class RemoveLastObjectTest {

    @Test
    public void testRemoveLastObject() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Display the ArrayList before removal (optional)
        System.out.println("ArrayList before removal: " + stringList);

        // Remove the last object
        RemoveLastObjectExample.removeLastObject(stringList);

        // Expected ArrayList after removal
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Apple");
        expectedList.add("Banana");
        expectedList.add("Orange");

        // Display the ArrayList after removal (optional)
        System.out.println("Expected ArrayList after removal: " + expectedList);

        // Check if the actual ArrayList matches the expected ArrayList
        assertEquals(expectedList, stringList);
    }

    @Test
    public void testRemoveLastObjectEmptyList() {
        // Create an empty ArrayList of Strings
        ArrayList<String> emptyList = new ArrayList<>();

        // Remove the last object from an empty list
        RemoveLastObjectExample.removeLastObject(emptyList);

        // The list should remain empty
        assertEquals(0, emptyList.size());
    }
}
