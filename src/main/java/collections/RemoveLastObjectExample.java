package collections;

import java.util.ArrayList;

public class RemoveLastObjectExample {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Display the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Remove the last object
        removeLastObject(stringList);

        // Display the ArrayList after removal
        System.out.println("ArrayList after removal: " + stringList);
    }

    // Method to remove the last object from the ArrayList
    public static void removeLastObject(ArrayList<String> list) {
        if (!list.isEmpty()) {
            // Remove the last object
            list.remove(list.size() - 1);
        } else {
            System.out.println("ArrayList is empty. No elements to remove.");
        }
    }
}
