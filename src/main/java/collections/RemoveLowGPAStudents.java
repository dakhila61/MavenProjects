package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveLowGPAStudents {

    public static void main(String[] args) {
        // Create an ArrayList of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", 3.8));
        students.add(new Student("Bob", "Johnson", 2.9));
        students.add(new Student("Alice", "Williams", 4.0));

        // Display the list before removal (optional)
        System.out.println("Students before removal: " + students);

        // Remove students with GPA less than the average GPA
        removeLowGPAStudents(students);

        // Display the list after removal
        System.out.println("Remaining students: " + students);
    }

    // Method to remove students with GPA less than the average GPA
    public static void removeLowGPAStudents(List<Student> studentList) {
        // Calculate the average GPA
        double averageGPA = calculateAverageGPA(studentList);

        // Use Iterator to safely remove elements during iteration
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGpa() < averageGPA) {
                // Remove the student with low GPA
                iterator.remove();
            }
        }
    }

    // Method to calculate the average GPA
    private static double calculateAverageGPA(List<Student> studentList) {
        if (studentList.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0.0;
        for (Student student : studentList) {
            totalGPA += student.getGpa();
        }

        return totalGPA / studentList.size();
    }
}

