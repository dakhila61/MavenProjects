package collections;

import java.util.HashMap;

public class StudentHashMapExample {
    public static void main(String[] args) {
        // Create a HashMap of Student objects
        HashMap<String, Student> studentHashMap = new HashMap<>();

        // Populate the HashMap with 8 students
        studentHashMap.put("John", new Student("John", "Doe", 3.5));
        studentHashMap.put("Jane", new Student("Jane", "Smith", 3.8));
        studentHashMap.put("Bob", new Student("Bob", "Johnson", 2.9));
        studentHashMap.put("Alice", new Student("Alice", "Williams", 4.0));
        studentHashMap.put("Charlie", new Student("Charlie", "Brown", 3.2));
        studentHashMap.put("Eva", new Student("Eva", "Davis", 3.7));
        studentHashMap.put("Frank", new Student("Frank", "Wilson", 3.9));
        studentHashMap.put("Grace", new Student("Grace", "Lee", 3.4));

        // Test the method to retrieve a Student object by name
        String studentName = "Bob";
        Student retrievedStudent = getStudentByName(studentHashMap, studentName);

        if (retrievedStudent != null) {
            System.out.println("Student found: " + retrievedStudent);
        } else {
            System.out.println("Student not found for name: " + studentName);
        }
    }

    // Method to retrieve a Student object by name from the HashMap
    public static Student getStudentByName(HashMap<String, Student> studentHashMap, String name) {
        return studentHashMap.get(name);
    }
}

