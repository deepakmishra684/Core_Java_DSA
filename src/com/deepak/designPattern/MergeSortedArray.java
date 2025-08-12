package com.deepak.designPattern;

import java.util.Arrays;

public class MergeSortedArray {

	private static int[] mergedArray1(int[] arr1, int[] arr2) {
		int arr[] = new int[arr1.length + arr2.length];
		int i = arr1.length;
		int j = 0;
		int k = 0;
		while (k < arr1.length) {
			arr[k] = arr1[k];
			k++;
		}
		while (i < arr.length && j < arr2.length) {
			arr[i] = arr2[j];
			j++;
			i++;
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 5, 9, 22, 23, 30, 56, 67, 78, 90 };
		int[] arr2 = { 2, 2, 5, 12, 34, 45, 51, 66 };
		System.out.println("Sorted Array Result :: " + Arrays.toString(mergedArray1(arr1, arr2)));

	}

}
