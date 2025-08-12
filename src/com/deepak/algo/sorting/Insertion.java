package com.deepak.algo.sorting;

import java.util.Arrays;

public class Insertion {

	public static int[] insertionSort(int[] arr) {
		int num = 0, j;
		for (int i = 1; i < arr.length; i++) {
			num = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > num; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = num;

		}
		return arr;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 2, 9, 20, 1, 3, 55, -1, 2, 0 };

		System.out.println("-----Insertion Sort-----");
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
}
