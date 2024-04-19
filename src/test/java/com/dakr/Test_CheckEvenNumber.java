package com.dakr;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class Test_CheckEvenNumber {
	@Test
    public void testIsEven() {
        CheckEvenNumber checker = new CheckEvenNumber();

        assertTrue(checker.isEven(2));
        assertTrue(checker.isEven(0));
        assertFalse(checker.isEven(3));
        assertFalse(checker.isEven(-5));
    }

    @Test
    public void testIsEvenWithMockito() {
    	
        // Create a mock EvenNumberChecker instance
    	CheckEvenNumber checker = mock(CheckEvenNumber.class);

        // Define the behavior of the mock object
        when(checker.isEven(4)).thenReturn(true);
        when(checker.isEven(5)).thenReturn(false);
        
        // Test the isEven method with mocked behavior
        assertTrue(checker.isEven(4));
        assertFalse(checker.isEven(5));
    }

}
