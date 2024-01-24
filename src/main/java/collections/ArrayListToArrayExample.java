package collections;

import java.util.ArrayList;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");

        // Convert ArrayList to array
        String[] stringArray = new String[arrayList.size()];
        stringArray = arrayList.toArray(stringArray);

        // Print the elements of the array
        System.out.println("Elements in the array:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
