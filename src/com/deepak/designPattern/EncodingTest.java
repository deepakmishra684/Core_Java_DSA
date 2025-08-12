package com.deepak.designPattern;

public class EncodingTest {

	// String static result="";
	public static String encoding(String str) {
		char[] ch = str.toCharArray();
		int counter = 1;
		String result = "";
		for (int i = 1; i < ch.length; i++) {
			if (ch[i - 1] == ch[i]) {
				++counter;
			} else {

				result = result + counter + ch[i - 1];
				counter = 1;
			}
		}
		result = result + counter + ch[ch.length-1];
		return result;
	}

	public static void main(String[] args) {
		String str = "MMMYYWWZZZZZMMG";
		System.out.println("Encoding :: " + encoding(str));
	}

}
