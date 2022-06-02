package com.uvas.codeproblems;

public class LastIndexOfElementInArray {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 5, 5, 5, 7};
		int element = 3;
		int index = arr.length - 1;
		System.out.println("Input Array :: " + arr);
		System.out.println("Last Index of Element :: "+element+ " in given Array is :: " + calculateLastIndexOfElement(arr, element, index));
	}

	private static int calculateLastIndexOfElement(int[] arr, int element, int index) {
		
		if(index < 0) {
			return -1;
		}
		
		if(arr[index] == element) {
			return index;
		}
		
		return calculateLastIndexOfElement(arr, element, index-1);
	}

	
}
