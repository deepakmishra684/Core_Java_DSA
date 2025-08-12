package com.deepak.java11coding;

import java.util.Optional;

public class OptionalExample {
	
	public static void isEmptyExample() {
		
		String str1=null;
		String str2="Deepak";
		System.out.println(Optional.ofNullable(str1).isEmpty());
		System.out.println(Optional.ofNullable(str2).isEmpty());
	}
	
	public static void main(String[] args) {
		isEmptyExample();
	}

}
