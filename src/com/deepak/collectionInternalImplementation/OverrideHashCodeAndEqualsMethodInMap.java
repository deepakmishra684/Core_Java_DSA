package com.deepak.collectionInternalImplementation;

import java.util.HashMap;

class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	/*
	 * Must Override hashCode and equals mathod to remove dublicasy in hash
	 * bashed collection including HashMap, HashSet,and Hashtable
	 */

	@Override
	public boolean equals(Object obj) {
		// if both the object references are referring to the same object.
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		return (emp.getId() == this.id && emp.getFirstName().equals(this.firstName)
				&& emp.getLastName().equals(this.lastName) && emp.getSalary() == this.getSalary());
	}

	@Override
	public int hashCode() {
		int result = 0;
		result += firstName.hashCode();
		result += Integer.valueOf(id).hashCode();
		result += lastName.hashCode();
		result += Integer.valueOf(salary).hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + 
				", salary=" + salary+ "]";
	}

}

public class OverrideHashCodeAndEqualsMethodInMap {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Ankit", "Singh", 4000);
		Employee emp2 = new Employee(1, "Ankit", "Singh", 4000);
		Employee emp3 = new Employee(2, "Ankit", "Singh", 2000);
		Employee emp4 = new Employee(2, "Ankit", "Singh", 2000);

		HashMap<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "Ankit");
		map.put(emp2, "monu");
		map.put(emp3, "Deepak");
		map.put(emp4, "sonu");

		for (Employee emp : map.keySet()) {
			System.out.println(map.get(emp).toString());
		}
	}
}
