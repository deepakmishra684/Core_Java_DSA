package com.deepak.designPattern;

import java.util.Objects;

public final class Employee {

	private final int id;
	private final String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee myEmmutable(int id, String name) {
		if (this.id == id && Objects.equals(this.name, name)) {
			return this;
		} else
			return new Employee(id, name);
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Deepak");
		Employee emp2 = emp1.myEmmutable(1, "Deepak");
		Employee emp3 = emp1.myEmmutable(2, "Deepak");
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));

	}
}
