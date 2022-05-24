package com.uvas.codeproblems;
/**
 * 
 * @author uvas
 *
 * a simple non optimized solution to reverse a string
 * 
 */

public class ReverseString {

	public static void main(String[] args) {		
		String s = "reverseme";
		System.out.println("Given string ::"+ s);
		
		String r = reverseString(s);
		System.out.println("reversed string ::"+ r);
	}

	private static String reverseString(String s) {
		
		if(s == null) {
			return null;
		}
		if(s == "") {
			return "";
		}
		
		String r = "";
		
		for(int i =s.length(); i >0; i--) {
			r = r + s.charAt(i-1);
		}
		return r;
		
	}

}
