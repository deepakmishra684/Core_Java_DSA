package com.deepak.java8coding;

public class MissingNumberFinder {
	/*
	 * Find the missing number in an array (Given an array of size n-1 containing
	 * numbers from 1 to n, find the missing number)
	 */
	public static int findMissingNumber(int[] arr) {
		int num = arr.length + 1;
		int expectSum = num * (num + 1) / 2;
		int actualSum = 0;
		for (int n : arr) {
			actualSum += n;
		}
		return expectSum - actualSum;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5 }; // n = 5

		int missing = findMissingNumber(arr);
		System.out.println("Hey User the Missing number is: " + missing);
	}
}
