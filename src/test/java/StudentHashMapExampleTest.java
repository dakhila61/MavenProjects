import collections.Student;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentHashMapExampleTest {

    @Test
    public void testGetStudentByName() {
        // Creating a HashMap with Student objects
        HashMap<String, Student> studentHashMap = new HashMap<>();
        Student john = new Student("John", "Doe", 3.5);
        studentHashMap.put(john.getFirstName(), john);

        // Your actual method to retrieve a student by name
        Student retrievedStudent = getStudentByName(studentHashMap, "John");

        // Expected Student object
        Student expectedStudent = new Student("John", "Doe", 3.5);

        // Asserting the equality
        assertEquals(expectedStudent, retrievedStudent);
    }

    private Student getStudentByName(HashMap<String, Student> studentHashMap, String name) {
        // Your logic to retrieve a student by name
        return studentHashMap.get(name);
    }
}
