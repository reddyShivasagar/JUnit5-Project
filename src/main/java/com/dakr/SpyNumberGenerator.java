package com.dakr;

public class SpyNumberGenerator {
	    
	    public static boolean isSpyNumber(int number) {
	        String numStr = String.valueOf(number);
	        int sum = 0;
	        int product = 1;

	        for (int i = 0; i < numStr.length(); i++) {
	            int digit = numStr.charAt(i) - '0';
	            sum += digit;
	            product *= digit;
	        }

	        return sum == product;
	    }
}


