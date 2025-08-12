package com.deepak.collectionSorting;

import java.util.Arrays;

class Employee1 {
	private String id;
	private String name;
	private String salary;

	public Employee1(String id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	public boolean equals(Object obj) {
		// if both the object references are referring to the same object.
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != getClass())
			return false;
		Employee1 emp = (Employee1) obj;
		return (emp.getId().equals(this.id) && emp.getName().equals(this.name) && emp.getSalary().equals(this.salary));

	}

	public int hashCode() {
		int result = 0;
		result += id.hashCode();
		return result;

	}

	public String toString()

	{
		return "[ id=" + id + " ,name=" + name + " ,salary=" + salary + " ]";
	}

}

public class ListSortByHashCodeAndEqualsMethod {

	public static void main(String[] args) {

		Employee1 emp1[] = new Employee1[4];
		emp1[0] = new Employee1("124", "deepak", "1000");
		emp1[1] = new Employee1("125", "dharam", "1000");
		emp1[2] = new Employee1("121", "dharam", "1200");
		emp1[3] = new Employee1("100", "deepak", "1210");

		for (int i = 0; i < emp1.length; i++) {
			for (int j = i + 1; j < emp1.length; j++) {
				if (emp1[i].hashCode() > emp1[j].hashCode()) {
					Object o = null;
					o = emp1[i];
					emp1[i] = emp1[j];
					emp1[j] = (Employee1) o;

				}
			}
		}
		System.out.println(Arrays.toString(emp1));
	}
}
