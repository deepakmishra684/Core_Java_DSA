package com.deepak.designPattern;

import java.io.Serializable;

public class Singelton implements Serializable, Cloneable {
	private static volatile Singelton singleInstance;

	// inside constructor condition given to avoid object creation through
	// Reflection
	private Singelton() {
		if (singleInstance != null) {
			throw new RuntimeException("Use getSingleInstance() method");
		}
	}

	public static Singelton getSingleInstance() {

		if (singleInstance == null) {
			synchronized (Singelton.class) {
				if (singleInstance == null) {
					singleInstance = new Singelton();
				}
			}
		}
		return singleInstance;
	}

	// Implement readResolve() method in your class to avoid through Serialization &
	// Deserialization
	protected Object readResolve() {
		return getSingleInstance();
	}

	// Override clone() method to avoid through clone object creation
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning not allowed");
	}

	public static void main(String[] args) {
		System.out.println(getSingleInstance().hashCode());
		System.out.println(singleInstance.hashCode());
	}
}