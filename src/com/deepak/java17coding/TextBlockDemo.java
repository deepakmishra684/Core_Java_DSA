package com.deepak.java17coding;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TextBlockDemo {
	public static void main(String[] args) throws Exception {

		String jsonPayload = """
				{
				    "name": "Deepak Mishra",
				    "role": "Technical Lead",
				    "skills": ["Java", "Spring Boot", "Microservices"]
				}
				""";

		String sqlQuery = """
				SELECT name, role
				FROM employees
				WHERE department = 'Engineering'
				ORDER BY name;
				""";

		System.out.println("JSON Payload:\n" + jsonPayload);
		System.out.println("SQL Query:\n" + sqlQuery);

		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://httpbin.org/post"))
				.header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString(jsonPayload))
				.build();

		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println("Response:\n" + response.body());
	}
}
