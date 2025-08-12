package com.deepak.java8coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConvertWordToNum {
	static int divider = 0;

	public static int wordToNumConversion(String str) {
		String[] words = str.replaceAll(",", "").replaceAll(" and", "").toLowerCase().split(" ");
		System.out.println(Arrays.toString(words));
		Map<String, Integer> map = new HashMap();
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("ten", 10);
		map.put("eleven", 11);
		map.put("twelve", 12);
		map.put("thirteen", 13);
		map.put("fourteen", 14);
		map.put("fifteen", 15);
		map.put("sixteen", 16);
		map.put("seventeen", 17);
		map.put("eighteen", 18);
		map.put("nineteen", 19);
		map.put("twenty", 20);
		map.put("thirty", 30);
		map.put("forty", 40);
		map.put("fifty", 50);
		map.put("sixty", 60);
		map.put("seventy", 70);
		map.put("eighty", 80);
		map.put("ninety", 90);
		int total = 0;
		int current = 0;
		for (String word : words) {
			if (map.containsKey(word)) {
				current += map.get(word);
			} else if (word.equals("hundread")) {
				current *= 100;
			} else if (word.equals("thousands")) {
				total = current * 1000;
				current = 0;
			}
		}
		return total + current;
	}

	public static String numToWordConversion(int num) {
		if (num == 0)
			return "Zero";

		Map<Integer, String> map = new HashMap<>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(40, "forty");
		map.put(50, "fifty");
		map.put(60, "sixty");
		map.put(70, "seventy");
		map.put(80, "eighty");
		map.put(90, "ninety");

		StringBuilder result = new StringBuilder();

		if (num >= 1000) {
			int thousands = num / 1000; // -->12111
			//System.out.println(thousands);
			result.append(convertBelowThousand(thousands, map)).append(" thousand");
			num %= 1000;
			if (num > 0)
				result.append(", ");
		}

		if (num > 0) {
			result.append(convertBelowThousand(num, map));
		}

		// Capitalize first letter
		result.setCharAt(0, Character.toUpperCase(result.charAt(0)));

		return result.toString();
	}

	private static String convertBelowThousand(int num, Map<Integer, String> map) {
		StringBuilder part = new StringBuilder();
         System.out.println(num);
		if (num >= 100) {
			int hundreds = num / 100;
			part.append(map.get(hundreds)).append(" hundred");
			num %= 100;
			if (num > 0)
				part.append(" and ");
		}

		if (num >= 20) {
			int tens = (num / 10) * 10;
			int ones = num % 10;
			part.append(map.get(tens));
			if (ones > 0)
				part.append(" ").append(map.get(ones));
		} else if (num > 0) {
			part.append(map.get(num));
		}

		return part.toString();
	}

	public static void main(String[] args) {
		String str = "Twenty two thousands, seven hundread and forty six";
		System.out.println(wordToNumConversion(str));
		int num = 12111;
		String result = numToWordConversion(num);
		//String finalResult = result.replaceAll(" zero", "").replaceAll(" and", "");
		System.out.println(numToWordConversion(num));
	}

}
