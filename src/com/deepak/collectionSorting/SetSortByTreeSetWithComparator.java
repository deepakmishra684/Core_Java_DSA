package com.deepak.collectionSorting;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee8 {
	private Long empId;
	private String empName;
	private String empEmail;
	private int salary;
	private int age;
	private String city;

	public Employee8(Long empId, String empName, String empEmail, int salary, int age, String city) {
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
	public String toString() {
		return "Employee8 [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", salary=" + salary
				+ ", age=" + age + ", city=" + city + "]";
	}
}

public class SetSortByTreeSetWithComparator {
	public static void main(String[] args) {
		Employee8 emp1 = new Employee8(new Long(555), "Deepak", "deepak@gmail.com", 30000, 26, "Lucknow");
		Employee8 emp2 = new Employee8(new Long(111), "Deepak", "deepak@gmail.com", 3000, 25, "Lucknow");
		Employee8 emp3 = new Employee8(new Long(555), "Deepak", "deepak@gmail.com", 3000, 26, "Lucknow");
		Employee8 emp4 = new Employee8(new Long(222), "Deepak", "deepak@gmail.com", 30000, 26, "kanpur");
		Employee8 emp5 = new Employee8(new Long(555), "Deepak", "deepak@gmail.com", 30000, 24, "Lucknow");

		Set<Employee8> set = new TreeSet<Employee8>(new Comparator<Employee8>() {

			@Override
			public int compare(Employee8 emp1, Employee8 emp2) {
				int i = (int) (emp1.getEmpId() - emp2.getEmpId());
				if (i == 0)
					i = emp1.getEmpName().compareTo(emp2.getEmpName());
				if (i == 0)
					i = emp1.getEmpEmail().compareTo(emp2.getEmpEmail());
				if (i == 0)
					i = emp1.getSalary() - emp2.getSalary();
				if (i == 0)
					i = emp1.getAge() - emp2.getAge();
				if (i == 0)
					i = emp1.getCity().compareTo(emp2.getCity());
				return i;
			}
		});

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);

		Iterator<Employee8> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}