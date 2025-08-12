package com.deepak.algo.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Heap {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println(".......Heap sort testing.......");
		System.out.println("*******************************");
		System.out.println("Enter integer number whatever you want means length of array.... ");
		n = sc.nextInt();

		/* Make array of n elements */
		int arr[] = new int[n];
		System.out.println("Enter " + n + " integer elements..");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		/* Call method sort */
		sort(arr);
		System.out.println("-----------------------------------");
		System.out.println("......Sorting array.......");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	public static int N;

	/* sorting function */
	public static void sort(int arr[]) {
		heapify(arr);
		for (int i = N; i > 0; i--) {
			swap(arr, 0, i);
			N = N - 1;
			maxheap(arr, 0);
		}
	}

	/* function to build a heap */
	public static void heapify(int arr[]) {
		N = arr.length - 1;
		for (int i = N / 2; i >= 0; i--) {
			maxheap(arr, i);
		}
	}

	/* function to make max heap */
	public static void maxheap(int arr[], int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int max = i;
		if (left <= N && arr[left] > arr[i]) {
			max = left;
		}
		if (right <= N && arr[right] > arr[max]) {
			max = right;
		}
		if (max != i) {
			swap(arr, i, max);
			maxheap(arr, max);
		}
	}

	/* function to swap 2 number in array */
	public static void swap(int arr[], int i, int max) {
		int temp = arr[i];
		arr[i] = arr[max];
		arr[max] = temp;
	}
}
