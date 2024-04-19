package com.dakr;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SpyNumberGeneratorTest {
	
	    @Test
	    public void testSpyNumberPositive() {
	        assertTrue(SpyNumberGenerator.isSpyNumber(1124));
	        assertTrue(SpyNumberGenerator.isSpyNumber(22));
	    }

	    @Test
	    public void testSpyNumberNegative() {
	        assertFalse(SpyNumberGenerator.isSpyNumber(-123));
	        assertFalse(SpyNumberGenerator.isSpyNumber(-1234));
	    }

}
