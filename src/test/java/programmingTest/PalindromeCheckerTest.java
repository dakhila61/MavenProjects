package programmingTest;
import programming.PalindromeChecker;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        // Test with palindrome numbers
        assertTrue(palindromeChecker.isPalindrome(121));
        assertTrue(palindromeChecker.isPalindrome(1221));
        assertTrue(palindromeChecker.isPalindrome(12321));
        assertTrue(palindromeChecker.isPalindrome(123321));
        assertTrue(palindromeChecker.isPalindrome(1234321));

        // Test with non-palindrome numbers
        assertFalse(palindromeChecker.isPalindrome(123));
        assertFalse(palindromeChecker.isPalindrome(1234));
        assertFalse(palindromeChecker.isPalindrome(12345));
        assertFalse(palindromeChecker.isPalindrome(123456));

        // Test with single-digit number
        assertTrue(palindromeChecker.isPalindrome(0));
        assertTrue(palindromeChecker.isPalindrome(1));
        assertTrue(palindromeChecker.isPalindrome(2));

        // Test with negative numbers
        assertFalse(palindromeChecker.isPalindrome(-121));
        assertFalse(palindromeChecker.isPalindrome(-1221));
        assertFalse(palindromeChecker.isPalindrome(-12321));
        assertFalse(palindromeChecker.isPalindrome(-123321));
        assertFalse(palindromeChecker.isPalindrome(-1234321));
    }
}