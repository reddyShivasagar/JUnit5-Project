package com.dakr;

public class Fibonacci {

	    public int calculateFibonacci(int n) {
	        
	    	if (n <= 0)
	            return 0;
	        else if (n == 1)
	            return 1;
	        else
	            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
	    }
}



 	