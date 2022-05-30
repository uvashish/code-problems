package com.uvas.codeproblems;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		Integer number = 12345;
		System.out.println("Input :: "+ number);
		int count = countDigits(number);
		System.out.println("Number of digits :: "+ count);
	}
	
	private static int countDigits(int num) {
		if(num/10 == 0) {
			return 1;
		}
		return 1 + countDigits(num/10);
	}

	
}
