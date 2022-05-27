package com.uvas.codeproblems;

import java.util.Stack;
/**
 * 
 * @author uvas
 *
 */
public class RemoveTwoConsecutiveDuplicateLetters {

	public static void main(String[] args) {
		System.out.println("RemoveKConsecutiveDuplicates");
		
		String s = "abbbccddeeeee";
		
		System.out.println("input string :: "+s);
		System.out.println("output string :: "+removeKConsecutiveDuplicates(s));

	}

	private static String removeKConsecutiveDuplicates(String s) {
		
		if(s == null) {
			return null;
		}
		if(s.isEmpty() || s.length() == 1) {
			return s;
		}
		
		String result = "";

		Stack<Character> stack = new Stack<>();
		int remainingElementInString  = s.length();
		
		int index = 0;
		while(remainingElementInString > 0) {
			if(stack.empty() || !stack.peek().equals(s.charAt(index))) {
				stack.push(s.charAt(index));
				index++;
				remainingElementInString--;
			}else {
				stack.pop();
			}
		}

		while(stack.size() > 0) {
			result = result+stack.pop();
		}
		
		StringBuilder builder = new StringBuilder(result);
		builder.reverse();
		
		return builder.toString();
	}

}
