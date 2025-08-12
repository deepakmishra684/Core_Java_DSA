package com.deepak.java11coding;

import java.util.Arrays;
import java.util.List;

public class CollectionFeatures {

	public static void toArrayExample() {
		List<String> nameList = Arrays.asList("Deepak", "Mishra");
		System.out.println(Arrays.toString(nameList.toArray(String[]::new)));
	}

	public static void main(String[] args) {
		toArrayExample();
	}

}
