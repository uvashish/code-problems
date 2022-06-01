package com.uvas.codeproblems;

public class CountZerosInaNumber {

	public static void main(String[] args) {
		int number = 6010200;
		System.out.println("Input number :: "+ number);
		System.out.println("Number of zeros :: "+countNumbersInZero(number));
	}
	
	private static int countNumbersInZero(int number) {
		if(number == 0) {
			return 0;
		}
		if(number%10 == 0 ) {
			return 1 + countNumbersInZero(number/10);
		}else {
			return countNumbersInZero(number/10);
		}
	}

}
