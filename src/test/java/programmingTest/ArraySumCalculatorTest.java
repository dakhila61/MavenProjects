package programmingTest;
import programming.ArraySumCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArraySumCalculatorTest {

    @Test
    public void testCalculateArraySum() {
        ArraySumCalculator calculator = new ArraySumCalculator();

        // Test with an array containing positive integers
        int[] arr1 = {1, 2, 3, 4, 5};
        int expectedSum1 = 15;
        assertEquals(expectedSum1, calculator.calculateArraySum(arr1));

        // Test with an array containing negative integers
        int[] arr2 = {-1, -2, -3, -4, -5};
        int expectedSum2 = -15;
        assertEquals(expectedSum2, calculator.calculateArraySum(arr2));

        // Test with an empty array
        int[] arr3 = {};
        int expectedSum3 = 0;
        assertEquals(expectedSum3, calculator.calculateArraySum(arr3));

        // Test with an array containing a single element
        int[] arr4 = {10};
        int expectedSum4 = 10;
        assertEquals(expectedSum4, calculator.calculateArraySum(arr4));
    }
}