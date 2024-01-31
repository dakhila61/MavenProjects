package programmingTest;
import programming.ArrayListReverse;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;

public class ArrayListReverseTest {

    @Test
    public void testReverseArrayList() {
        ArrayListReverse reverser = new ArrayListReverse();

        // Test with an ArrayList containing integers
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> expected1 = new ArrayList<>();
        expected1.add(5);
        expected1.add(4);
        expected1.add(3);
        expected1.add(2);
        expected1.add(1);
        assertArrayEquals(expected1.toArray(), reverser.reverseArrayList(list1).toArray());

        // Test with an empty ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> expected2 = new ArrayList<>();
        assertArrayEquals(expected2.toArray(), reverser.reverseArrayList(list2).toArray());

        // Test with an ArrayList containing a single element
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        ArrayList<Integer> expected3 = new ArrayList<>();
        expected3.add(10);
        assertArrayEquals(expected3.toArray(), reverser.reverseArrayList(list3).toArray());
    }
}
