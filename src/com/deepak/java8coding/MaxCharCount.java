package com.deepak.java8coding;

import java.util.Map;
import java.util.stream.Collectors;

public class MaxCharCount {

	public static Map.Entry<Character, Long> maxChar(String str) {
		return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).orElseGet(null);
	}

	public static void main(String[] args) {
		String str = "aghjkkwkfwlwkw";
		Map.Entry<Character, Long> entry = maxChar(str);
		System.out.println("Char : " + entry.getKey() + " Count : " + entry.getValue());
	}

}
