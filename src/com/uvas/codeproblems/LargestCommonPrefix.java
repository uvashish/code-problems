package com.uvas.codeproblems;

public class LargestCommonPrefix {

	public static void main(String[] args) {
//		String [] array = null;
//		String [] array = {"kfcdgeecc" };
		String [] array = {"kfcdgeecc", "kfcdtyuii", "kfcdavd", "kfcdwet"};
		System.out.println("Result ::" + longestCommonPrefix(array));

	}

	private static String longestCommonPrefix(String[] array) {
		
		String longestPrefix = "";
		
		if(array == null || array.length == 0) {
			return null;
		}
		if(array.length ==  1) {
			return array[0];
		}
		
		String shortestString = array[0]; // make the first element 
		for (String s : array) {
			if(s.length() < shortestString.length()) {
				shortestString = s;
			}
		}
		
		for(int i =0; i < shortestString.length(); i++) {
			boolean isMatch=true;
			for(String s: array) {
				if (shortestString.charAt(i) != s.charAt(i)) {
					isMatch = false;
					break;
				}
			}
			if(isMatch) {
				longestPrefix = longestPrefix + shortestString.charAt(i);
			}
		}
		return longestPrefix;
	}
}
