package com.deepak.collectionSorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Employee5 {
	private Long empId;
	private String empName;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public Employee5(Long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee5 [empId=" + empId + ", empName=" + empName + "]";
	}
}

class Employee5Details {
	private Long empId;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	private String empEmail;
	private int salary;
	private int age;
	private String city;

	public Employee5Details(Long empId, String empEmail, int salary, int age, String city) {
		super();
		this.empId = empId;
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

	@Override
	public String toString() {
		return "Employee5Details [empId=" + empId + ", empEmail=" + empEmail + ", salary=" + salary + ", age=" + age
				+ ", city=" + city + "]";
	}

}

public class MapSortByKeyWithComparator {
	public static void main(String[] args) {
		Employee5 emp1 = new Employee5(new Long(444), "Deepak");
		Employee5 emp2 = new Employee5(new Long(222), "Ankit");
		Employee5 emp3 = new Employee5(new Long(111), "Dharampal");
		Employee5 emp4 = new Employee5(new Long(555), "Rahul");
		Employee5 emp5 = new Employee5(new Long(333), "Sonu");

		Employee5Details empDt1 = new Employee5Details(new Long(222), "ankit@gmail.com", 500000, 25, "Orai");
		Employee5Details empDt2 = new Employee5Details(new Long(444), "deepak@gmail.com", 5000, 26, "Lucknow");
		Employee5Details empDt3 = new Employee5Details(new Long(111), "dharampal@gmail.com", 78000, 24, "Panjab");
		Employee5Details empDt4 = new Employee5Details(new Long(333), "sonu@gmail.com", 50002, 23, "Kanpur");
		Employee5Details empDt5 = new Employee5Details(new Long(555), "rahul@gmail.com", 300000, 25, "Unnao");

		Map<Employee5, Employee5Details> unMap = new HashMap<Employee5, Employee5Details>();
		unMap.put(emp1, empDt1);
		unMap.put(emp2, empDt2);
		unMap.put(emp3, empDt3);
		unMap.put(emp4, empDt4);
		unMap.put(emp5, empDt5);
		System.out.println("------------------UnSorted Map-----------------------------");
		printMap(unMap);
		System.out.println("************************************************************");
		System.out.println("-------------Sorted Map By Key Using TreeMap(Comparator c)-------------------");
		Map<Employee5, Employee5Details> sortMap = new TreeMap<Employee5, Employee5Details>(
				new Comparator<Employee5>() {
					public int compare(Employee5 emp1, Employee5 emp2) {
						int i = emp1.getEmpId().compareTo(emp2.getEmpId());
						if (i == 0)
							i = emp1.getEmpName().compareTo(emp2.getEmpName());
						return i;
					}
				});
		sortMap.putAll(unMap);
		printMap(sortMap);
	}

	public static void printMap(Map<Employee5, Employee5Details> map) {
		for (Map.Entry<Employee5, Employee5Details> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "....." + entry.getValue());
		}
	}
}
