package com.deepak.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee3 {
	private Integer id;
	private String name;
	private int salary;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public Employee3(Integer id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Employee3 emp = (Employee3) obj;

		return emp.getId().equals(this.id) && emp.getName().equals(this.name) && emp.getSalary() == this.salary;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result += id.hashCode();
		result += name.hashCode();
		result += salary;
		return result;
	}

	public String toString() {
		return "[ id=" + id + " ,name=" + name + " ,salary=" + salary + " ]";
	}
}

public class ListSortByComparator {

	public static void main(String[] args) {

		/* sorting by comparator */
		List<Employee3> list = new ArrayList<Employee3>();
		list.add(new Employee3(111, "pappu", 10000));
		list.add(new Employee3(111, "pappu", 11000));
		list.add(new Employee3(111, "abhi", 15000));
		list.add(new Employee3(112, "abhi", 10000));
		list.add(new Employee3(114, "pappu", 12000));

		Collections.sort(list, new Comparator<Employee3>() {
			public int compare(Employee3 emp1, Employee3 emp2) {
				int i = emp1.getId().compareTo(emp2.getId());
				if (i == 0)
					i = emp1.getName().compareTo(emp2.getName());
				if (i == 0)
					i = emp1.getSalary() - (emp2.getSalary());
				return i;
			}
		});
		System.out.println(list);
	}
}