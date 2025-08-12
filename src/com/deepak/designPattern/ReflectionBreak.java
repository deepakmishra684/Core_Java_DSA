package com.deepak.designPattern;

import java.lang.reflect.Constructor;

public class ReflectionBreak {
	public static void main(String[] args) throws Exception {
		Singelton instance1 = Singelton.getSingleInstance();
		Constructor<Singelton> constructor = Singelton.class.getDeclaredConstructor();
		constructor.setAccessible(true);

		Singelton instance2 = constructor.newInstance();

		System.out.println(instance1 == instance2);
	}
}
