package programming;

public class ArraySumCalculator {

    public int calculateArraySum(int[] arr) {
        int sum = 0;
        // Iterate through the array and add each element to the sum
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}