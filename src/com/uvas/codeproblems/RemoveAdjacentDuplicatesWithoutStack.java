package com.uvas.codeproblems;

public class RemoveAdjacentDuplicatesWithoutStack {
	public static void main(String[] args) {
		System.out.println("RemoveKConsecutiveDuplicates");
		
//		String s = "Mississippi";
//		String s = "aabbcc";
		String s = "ZabbaccdeedX";
		
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
		char [] array = s.toCharArray();
		
		int ptr = -1;
	
		for(int i=0; i < array.length; i++) {
			if(ptr == -1 || array[i] != array[ptr]) {
				ptr++;
				array[ptr] = array[i];
			}else {
				ptr--;
			}
		}
		
		System.out.println("ptr :: "+ptr);
		
		int index = 0;
		while(index <= ptr ) {
			System.out.println(array[index]);
			result = result + array[index];
			index++;
		}
		return result;
	}
}
