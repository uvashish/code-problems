package com.uvas.codeproblems;

public class CalculateGeometricSum {

	public static void main(String[] args) {
		int n = 3;
		System.out.println("Calculate geometric sum of series of length :: "+n);
		System.out.println("Result of geometric sum of series of length :: "+calculateGeometricSum(n));
	}

	private static Double calculateGeometricSum(int n) {

		if( n == 0) {
			return 1d;
		}
		
		Double subSum = calculateGeometricSum(n - 1);
		subSum = subSum + 1.0/Math.pow(2, n);
		
		return subSum;
	}

}
