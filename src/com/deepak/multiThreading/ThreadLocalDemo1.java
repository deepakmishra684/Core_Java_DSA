package com.deepak.multiThreading;

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		ThreadLocal<String> l1 = new ThreadLocal<String>();
		System.out.println(l1.get());
		l1.set("deepak");
		System.out.println(l1.get());
		l1.remove();
		System.out.println(l1.get());
	}
}
