package com.uvas.codeproblems;

import java.util.Stack;

public class RemoveKAdjacentDuplicates {


	public static void main(String [] args) {
//		String s = "Mississsipiii";
		String s = "xabbbazttffft";
		int k = 3;
		System.out.println("input string ::  "+s + " and k :: "+k);
		
		System.out.println("output string :: "+ removeKAdjacentDuplicates(s,k));
	}

	private static String removeKAdjacentDuplicates(String s, int k) {
		String result = "";
		
		class Pair{
			private char c;
			private int i;
			Pair(char c, int i){
				this.c = c;
				this.i = i;
			}
			public char getChar(){
				return this.c;
			}
			public int getCount(){
				return this.i;
			}
			public void setCount(int i) {
				this.i = i;
			}
			public String toString() {
				return "char:: " + this.c + " -- "+ "count:: " + this.i;
			}
		}
				
		Stack<Pair> stack = new Stack<>();
		
		for(int i = 0;i<s.length();i++) {
			if(stack.isEmpty() || s.charAt(i) != stack.peek().getChar()) {
				Pair p = new Pair(s.charAt(i), 1);
				stack.push(p);
			}else {
				Pair p = stack.peek();
				int count = p.getCount();
				p.setCount(count+1);
				if(p.getCount() == k) {
					stack.pop();
				}
			}
		}

		while(stack.size() > 0) {
			Pair p = stack.pop();
			int count = p.getCount();
			while(count > 0) {
				result = result + p.getChar();
				count--;
			}
		}
		
		return reverse(result);
	}
	
	private static String reverse(String s) {
		String reversed = "";
		for(int i = s.length()-1; i >= 0;i--) {
			reversed = reversed + s.charAt(i);
		}
		return reversed;
	}
}
