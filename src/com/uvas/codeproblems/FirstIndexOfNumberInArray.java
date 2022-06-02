package com.uvas.codeproblems;

public class FirstIndexOfNumberInArray {


	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 5, 5, 5, 7};
		int element = 5;
		int index = 0;
		System.out.println("Input Array :: " + arr);
		System.out.println("First Index of Element :: "+element+ " in given Array is :: " + calculateFirstIndexOfElement(arr, element, index));
	}

	private static int calculateFirstIndexOfElement(int[] arr, int element, int index) {
		
		if(index == arr.length) {
			return -1;
		}
		
		if(arr[index] == element) {
			return index;
		}
		return calculateFirstIndexOfElement(arr, element, index+1);
	}

}
