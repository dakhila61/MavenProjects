package loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int x = 12345;
        int y = reverseNumber(x);
        System.out.println("Input: " + x + ", Output: " + y);
    }

    static int reverseNumber(int num) {
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }
}
