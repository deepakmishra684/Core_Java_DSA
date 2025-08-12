package com.deepak.java17coding;

public class NullPointerException {
	public static void main(String[] args) {
		User user = null;
		System.out.println(user.getName()); // NullPointerException here
	}
}
