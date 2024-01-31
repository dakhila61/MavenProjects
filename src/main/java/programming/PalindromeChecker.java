package programming;

public class PalindromeChecker {

    public boolean isPalindrome(int num) {
        // Convert the number to a string
        String str = String.valueOf(num);

        // Initialize pointers for the start and end of the string
        int i = 0, j = str.length() - 1;

        // Iterate until the pointers meet
        while (i < j) {
            // Compare characters at the current pointers
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Not a palindrome
            }
            // Move the pointers towards the center
            i++;
            j--;
        }
        // If all characters match, it's a palindrome
        return true;
    }
}