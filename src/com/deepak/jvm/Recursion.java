package com.deepak.jvm;

public class Recursion {
public static void main(String[] args) {
	fun(10);
}

private static void fun(int i) {
	if(i>=0)
	{
		fun(i-1);
	}
	System.out.println("Recursion :: "+i);
	
}
}
