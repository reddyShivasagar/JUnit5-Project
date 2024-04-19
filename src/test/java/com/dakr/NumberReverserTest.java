package com.dakr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class NumberReverserTest {
	
	@Test
    public void testReverseNumber_Positive() {
        assertEquals(321, NumberReverser.reverseNumber(123));
        assertEquals(987654321, NumberReverser.reverseNumber(123456789));
    }

    @Test
    public void testReverseNumber_Negative() {
        assertEquals(-321, NumberReverser.reverseNumber(-123));
        assertEquals(-987654321, NumberReverser.reverseNumber(-123456789));
    }

    @Test
    public void testReverseNumber_Zero() {
        assertEquals(0, NumberReverser.reverseNumber(0));
    }

    // Mockito Example (not really necessary for this simple scenario)
    @Test
    public void testReverseNumber_MockitoExample() {
        // Mocking NumberReverser class
        NumberReverser numberReverserMock = mock(NumberReverser.class);

        // Stubbing the reverseNumber method
        when(numberReverserMock.reverseNumber(123)).thenReturn(321);
        when(numberReverserMock.reverseNumber(-123)).thenReturn(-321);
        when(numberReverserMock.reverseNumber(0)).thenReturn(0);

        assertEquals(321, numberReverserMock.reverseNumber(123));
        assertEquals(-321, numberReverserMock.reverseNumber(-123));
        assertEquals(0, numberReverserMock.reverseNumber(0));
    }
}
