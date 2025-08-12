package com.deepak.algo.sorting;

import java.util.Arrays;

public class Quick {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 20, 1, 3, 55, -1, 2, 0 };
		int rightIndex = arr.length - 1;
		quickSort(arr, 0, rightIndex);
		System.out.println("---------- Quick Sort -------");
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int index = partition(arr, leftIndex, rightIndex);
			quickSort(arr, leftIndex, index - 1);
			quickSort(arr, index + 1, rightIndex);
		}
	}

	private static int partition(int[] arr, int leftIndex, int rightIndex) {
		int pivot = arr[rightIndex];
		int i = leftIndex - 1;
		for (int j = leftIndex; j < rightIndex; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, rightIndex, i + 1);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
