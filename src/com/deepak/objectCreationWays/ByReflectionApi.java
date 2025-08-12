package com.deepak.objectCreationWays;

public class ByReflectionApi {
	public void fun() {
		System.out.println("Object creation by reflection api");
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ByNewKeyWord obj = (ByNewKeyWord) Class.forName("ObjectCreationWay.ByNewKeyword").newInstance();
		obj.fun();
	}
}
