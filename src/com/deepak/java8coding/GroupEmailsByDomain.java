package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmailsByDomain {
	public static Map<String, List<String>> byDomain(String[] emails) {
		return Arrays.stream(emails)
				.collect(Collectors.groupingBy(email -> email.substring(email.indexOf("@") + 1),
						Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
								.sorted((word1, word2) -> -word1.compareTo(word2)).collect(Collectors.toList()))));
	}

	public static void main(String[] args) {
		String[] emails = { "alice@example.com", "bob@test.com", "charlie@example.com", "dave@sample.com",
				"eve@test.com" };
		Map<String, List<String>> groupedByDomain = byDomain(emails);
		groupedByDomain.forEach((domain, list) -> {
			System.out.println(domain + ": " + list);
		});
	}

}
