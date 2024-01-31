package programming;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        // Use Collections.reverse() to reverse the ArrayList
        Collections.reverse(list);
        return list;
    }
}