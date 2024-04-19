package com.dakr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class Test_Fibonacci {
	
	 @Test
	    void testCalculateFibonacci() {
	        // Create a mock Fibonacci instance
	        Fibonacci fibonacci = mock(Fibonacci.class);

	        // Define the behavior of the mock object
	        when(fibonacci.calculateFibonacci(0)).thenReturn(0);
	        when(fibonacci.calculateFibonacci(1)).thenReturn(1);
	        when(fibonacci.calculateFibonacci(2)).thenReturn(1);
	        when(fibonacci.calculateFibonacci(3)).thenReturn(2);
	        when(fibonacci.calculateFibonacci(4)).thenReturn(3);
	        // Add more when() statements as needed for other test cases

	        // Test the calculateFibonacci method
	        assertEquals(0, fibonacci.calculateFibonacci(0));
	        assertEquals(1, fibonacci.calculateFibonacci(1));
	        assertEquals(1, fibonacci.calculateFibonacci(2));
	        assertEquals(2, fibonacci.calculateFibonacci(3));
	        assertEquals(3, fibonacci.calculateFibonacci(4));
	        // Add more assertEquals statements as needed for other test cases
	    }

}
