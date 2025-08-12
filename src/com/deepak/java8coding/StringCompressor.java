package com.deepak.java8coding;

public class StringCompressor {
	public static String compress(String str) {
		if (str == null || str.isEmpty())
			return str;

		StringBuilder compressed = new StringBuilder();
		int count = 1;
		char current = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == current) {
				count++;
			} else {
				compressed.append(current).append(count);
				current = str.charAt(i);
				count = 1;
			}
		}

		// append last character and its count
		compressed.append(current).append(count);

		// return original if compressed is not smaller
		return compressed.length() < str.length() ? compressed.toString() : str;
	}

	public static void main(String[] args) {
		String input = "aabcccccaaa";
		String result = compress(input);
		System.out.println("Result: " + result); // Output: a2b1c5a3
	}
}
