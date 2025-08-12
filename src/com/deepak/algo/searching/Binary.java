package com.deepak.algo.searching;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int n, search;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of size of array");
		n = sc.nextInt();
		int arr[] = new int[n];

		/* your array in must be in sorting order */

		System.out.println("Enter an array of n size.....");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter searching number whatever you want...");
		search = sc.nextInt();

		int first = 0;
		int last = n - 1;
		int middle = first + last;

		while (first <= last) {
			if (arr[middle] < search)
				first = middle + 1;
			else if (arr[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}

		if (first > last)
			System.out.println(search + " is not present in the array list.");
		sc.close();
	}

}
