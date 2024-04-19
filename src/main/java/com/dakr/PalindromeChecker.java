package com.dakr;

public class PalindromeChecker {

	
	public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
