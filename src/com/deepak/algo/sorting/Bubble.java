package com.deepak.algo.sorting;

import java.util.Arrays;

public class Bubble {

	public static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
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

		int arr[] = { 5, 10, 4, 2, 99, 36, 1, 2, 0 };
		System.out.println("------ Bubble Sort------");
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
}
