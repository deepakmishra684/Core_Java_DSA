package com.deepak.java17coding;

public class PatternMatching {

	public static void printObject(Object obj) {
		if (obj instanceof String s) {
			System.out.println("It's a String with length: " + s.length());
		} else if (obj instanceof Integer i) {
			System.out.println("It's an Integer with value: " + i);
		} else if (obj == null) {
			System.out.println("It's null");
		} else {
			System.out.println("Unknown type: " + obj.getClass().getName());
		}
	}

	public static void main(String[] args) {
		printObject("Deepak");
		printObject(123);
		printObject(null);
	}
}
