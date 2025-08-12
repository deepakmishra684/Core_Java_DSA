package com.deepak.algo.searching;

import java.util.Scanner;

public class Linear {
	public static void main(String[] args) {
		int n, number, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter an array of n size.....");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter searching number whatever you want...");
		number = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (number == arr[i]) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Your searching number  " + number + " is " + count + " times");
		} else
			System.out.println("Your searching number is not exit in array ");
		sc.close();
	}
}
