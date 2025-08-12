package com.deepak.collectionSorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee7 implements Comparable<Employee7> {
	private Long empId;
	private String empName;
	private String empEmail;
	private int salary;
	private int age;
	private String city;

	public Employee7(Long empId, String empName, String empEmail, int salary, int age, String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Override
	public int compareTo(Employee7 emp) {
		int i = (int) (this.empId - emp.empId);
		if (i == 0)
			i = this.empName.compareTo(emp.empName);
		if (i == 0)
			i = this.empEmail.compareTo(emp.empEmail);
		if (i == 0)
			i = this.salary - emp.salary;
		if (i == 0)
			i = this.age - emp.age;
		if (i == 0)
			i = this.city.compareTo(emp.city);
		return i;
	}

	@Override
	public String toString() {
		return "Employee7 [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", salary=" + salary
				+ ", age=" + age + ", city=" + city + "]";
	}
}

public class SetSortByTreeSetWithComparable {

	public static void main(String[] args) {
		Employee7 emp1 = new Employee7(new Long(555), "Deepak", "deepak@gmail.com", 30000, 26, "Lucknow");
		Employee7 emp2 = new Employee7(new Long(111), "Deepak", "deepak@gmail.com", 3000, 25, "Lucknow");
		Employee7 emp3 = new Employee7(new Long(555), "Deepak", "deepak@gmail.com", 3000, 26, "Lucknow");
		Employee7 emp4 = new Employee7(new Long(222), "Deepak", "deepak@gmail.com", 30000, 26, "kanpur");
		Employee7 emp5 = new Employee7(new Long(555), "Deepak", "deepak@gmail.com", 30000, 24, "Lucknow");

		Set<Employee7> set = new TreeSet<Employee7>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);

		Iterator<Employee7> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
