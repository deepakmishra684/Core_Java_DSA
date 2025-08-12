package com.deepak.objectCreationWays;

public class ByCloneMethod implements Cloneable {

	public void fun() {
		System.out.println("Object creation by clone method");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ByCloneMethod obj = new ByCloneMethod();
		ByCloneMethod obj1 = (ByCloneMethod) obj.clone();
		obj1.fun();
	}
}
