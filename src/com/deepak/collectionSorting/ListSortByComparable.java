package com.deepak.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	public Employee(int id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString()

	{
		return "[ id=" + id + " ,salary=" + salary + " ,name=" + name + " ]";
	}

	public int compareTo(Employee obj) {
		int id = this.id;
		int id1 = obj.getId();
		/*
		 * int id=Integer.parseInt(this.id); int
		 * id1=Integer.parseInt(obj.getId());
		 */
		int salary = Integer.parseInt(this.salary);
		int salary1 = Integer.parseInt(obj.getSalary());
		int result = id - id1;
		if (result == 0)
			result = salary - salary1;
		if (result == 0)
			result = this.name.compareTo(obj.getName());
		return result;
	}

}

public class ListSortByComparable {

	public static void main(String[] args) {

		/* sorting by comparable */
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(111, "pappu", "10000"));
		list.add(new Employee(111, "appu", "10000"));
		list.add(new Employee(112, "abhi", "15000"));
		list.add(new Employee(113, "abhi", "10000"));
		list.add(new Employee(114, "pappu", "12000"));
		Collections.sort(list);
		System.out.println(list);

	}
}
