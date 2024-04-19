package com.dakr;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

	
	@Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(checker.isPalindrome("Madam, in Eden I'm Adam"));
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("world"));
    }

    @Test
    public void testIsPalindromeWithMockito() {
        // Create a mock PalindromeChecker instance
        PalindromeChecker checker = mock(PalindromeChecker.class);

        // Define the behavior of the mock object
        when(checker.isPalindrome("level")).thenReturn(true);
        when(checker.isPalindrome("apple")).thenReturn(false);
        
        // Test the isPalindrome method with mocked behavior
        assertTrue(checker.isPalindrome("level"));
        assertFalse(checker.isPalindrome("apple"));
    }
}
