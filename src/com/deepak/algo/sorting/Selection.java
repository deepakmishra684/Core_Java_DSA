package com.deepak.algo.sorting;

import java.util.Arrays;

public class Selection {

	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 90, 28, 35, 10, 9, 6, 89, 99, 1 };

		System.out.println("-----Selection Sort------");
		System.out.println(Arrays.toString(selectionSort(arr)));
	}
}
