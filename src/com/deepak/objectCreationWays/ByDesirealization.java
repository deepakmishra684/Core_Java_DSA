package com.deepak.objectCreationWays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ByDesirealization {
	public void fun() {
		System.out.println("Object creation by Deserialization");
	}

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("deepak.txt");
		@SuppressWarnings("resource")
		BufferedReader ob = new BufferedReader(f);
		String line = ob.readLine();
		while (line != null) {
			System.out.println(line);
			line = ob.readLine();

		}

	}
}
