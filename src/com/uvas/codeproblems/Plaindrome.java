package com.uvas.codeproblems;

/**
 * 
 * @author uvas
 *
 * simple program to find if given string is a palindrome
 * 
 */
public class Plaindrome {

	public static void main(String[] args) {
		
		String s = "Madam";
		System.out.println("given string :: "+s);		
		System.out.println("is palindrome :: "+ isPalindrome(s));

	}

	
	private static boolean isPalindrome(String s) {
		
		if (s == null || s == "") {
			return false;
		}
		
		s = s.toLowerCase();
		
		boolean result = false;
		int start = 0;
		int end = s.length() - 1;
		
		 while(start <= end) {
			if (s.charAt(start) == s.charAt(end)){
				System.out.println(s.charAt(start) + " == "+ s.charAt(end));
				result = true;				
				start++;
				end--;
			}else {
				System.out.println(s.charAt(start) + " == "+ s.charAt(end));
				result = false;
				break;
			}
		}
		return result;
	}
}
