import collections.RemoveLowGPAStudents;
import org.junit.Test;
import collections.Student;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RemoveLowGPAStudentsTest {

    @Test
    public void testRemoveLowGPAStudents() {
        // Create an ArrayList of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", 3.8));
        students.add(new Student("Bob", "Johnson", 2.9));
        students.add(new Student("Alice", "Williams", 4.0));

        // Display the list before removal (optional)
        System.out.println("Students before removal: " + students);

        // Remove students with GPA less than the average GPA
        RemoveLowGPAStudents.removeLowGPAStudents(students);

        // Expected ArrayList after removal
        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student("Jane", "Smith", 3.8));
        expectedList.add(new Student("Alice", "Williams", 4.0));

        // Display the list after removal (optional)
        System.out.println("Expected ArrayList after removal: " + expectedList);

        // Print the contents of the lists for comparison
        System.out.println("Actual ArrayList after removal: " + students);

        // Check if the actual ArrayList matches the expected ArrayList
        assertEquals(expectedList.toString(), students.toString());

    }

}
