package com.deepak.java8coding;

public class CheckFibonacci {
	public static boolean isFibonacciSequence(int[] arr) {
		if (arr.length < 3) {
			return false; // A valid Fibonacci sequence needs at least 3 numbers
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != arr[i - 1] + arr[i - 2]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] input = { 0, 1, 1, 2, 3, 5, 8 }; // Try changing this array

		if (isFibonacciSequence(input)) {
			System.out.println("The array is a Fibonacci sequence.......");
		} else {
			System.out.println("The array is NOT a Fibonacci sequence......");
		}
	}
}
