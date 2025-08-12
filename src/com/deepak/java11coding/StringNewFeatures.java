package com.deepak.java11coding;

import java.util.stream.Stream;

public class StringNewFeatures {

	/*
	 * isBlank(): The isBlank() method returns true if the string is empty or
	 * contains only whitespace characters (spaces, tabs, newlines, etc.)
	 */
	public static void isBlankExample() {
		String str1 = "deepak . \n kkk";
		String str2 = " \t \n";
		String str3 = "Hello";
		System.out.println("str1 :: " + str1.isBlank());
		System.out.println("str2 :: " + str2.isBlank());
		System.out.println("str3 :: " + str3.isBlank());
	}

	/*
	 * lines(): The lines() method returns a stream of lines extracted from the
	 * string, split by line terminators (\n, \r, \r\n).
	 */
	public static void linesExample() {
		String str = "This is teh first Line.\nThis is second Line\n.";
		System.out.println(str);
		//Stream<String> lines = str.lines();
		//lines.forEach(System.out::println);
	}

	/* repeat(int count): Repeats the string */
	public static void repeatExample() {
		String str = "Deepak";
		int count = 4;
		System.out.println("Repeat result :: " + str.repeat(count));
	}

	/*
	 * stripLeading(): It is used to remove all leading white spaces from a string
	 * and return a new String.
	 */
	public static void stripLeadingExample() {
		String str = "   Hello, Deepak!";
		System.out.println("stripLeading :: " + str.stripLeading());
	}

	/*
	 * stripTrailing(): It is used to remove all trailing white spaces from a string
	 * and return a new String.
	 */
	public static void stripTrailingExample() {
		String str = "Hello, Deepak!   ";
		System.out.println("stripTrailing :: " + str.stripTrailing());
	}

	/* strip(): Removes leading and trailing spaces */
	public static void stripExample() {
		String str = "     Hello,   Deepak!      ";
		System.out.println("strip  :: " + str.strip());
	}

	public static void main(String[] args) {
		isBlankExample();
		linesExample();
		repeatExample();
		stripLeadingExample();
		stripTrailingExample();
		stripExample();
	}
}
