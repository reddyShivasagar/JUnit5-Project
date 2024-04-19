package com.dakr;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class PrimeNumberCheckerTest {

	
	 @Test
	    public void testIsPrime() {
	        PrimeNumberChecker checker = new PrimeNumberChecker();

	        assertTrue(checker.isPrime(2));
	        assertTrue(checker.isPrime(3));
	        assertTrue(checker.isPrime(5));
	        assertTrue(checker.isPrime(7));
	        assertFalse(checker.isPrime(4));
	        assertFalse(checker.isPrime(6));
	        assertFalse(checker.isPrime(8));
	        assertFalse(checker.isPrime(9));
	    }

	    @Test
	    public void testIsPrimeWithMockito() {
	        // Create a mock PrimeNumberChecker instance
	        PrimeNumberChecker checker = mock(PrimeNumberChecker.class);

	        // Define the behavior of the mock object
	        when(checker.isPrime(11)).thenReturn(true);
	        when(checker.isPrime(12)).thenReturn(false);
	        
	        // Test the isPrime method with mocked behavior
	        assertTrue(checker.isPrime(11));
	        assertFalse(checker.isPrime(12));
	    }	
}
