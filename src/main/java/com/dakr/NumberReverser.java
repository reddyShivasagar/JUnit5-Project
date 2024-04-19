package com.dakr;
public class NumberReverser {
    
    public static int reverseNumber(int number) {
       
    	int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}

