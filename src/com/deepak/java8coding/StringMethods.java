package com.deepak.java8coding;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str = "My naMe is Deepak Kuamar Mishra";
		String[] strArr = { "Shivan", "Ankit", "Manish", "Kumar", "Abhilash", "Mishra" };
		System.out.println(str.charAt(5));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 12));
		System.out.println("name".equalsIgnoreCase("Name"));
		System.out.println("Deepak".indexOf("e"));
		System.out.println("Deepak".lastIndexOf("e"));
		System.out.println("Kumar".contains("ma"));
		System.out.println("banana".startsWith("ban"));
		System.out.println("banana".endsWith("na"));
		System.out.println("  Hel lo ".trim());
		System.out.println("  Hel lo ".strip());
		System.out.println("  Hel lo ".stripLeading());
		System.out.println("  Hel lo ".stripTrailing());
		System.out.println(str.replaceFirst("M", "Q"));
		System.out.println(String.join("-", "a", "b", "c"));
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(" ".isEmpty());
		System.out.println(" ".isBlank());
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(2));
		System.out.println(str.codePointCount(2, 10));
		System.out.println(str.indent(1));
		System.out.println(str.indexOf("Deepak"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf("is", 0, 25));

	}

}
