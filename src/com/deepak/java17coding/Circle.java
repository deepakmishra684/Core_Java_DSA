package com.deepak.java17coding;

public final class Circle extends Shape {
	private final double redius;

	public Circle(double redius) {
		this.redius = redius;
	}

	public double area() {
		return Math.PI * redius * redius;
	}
}
