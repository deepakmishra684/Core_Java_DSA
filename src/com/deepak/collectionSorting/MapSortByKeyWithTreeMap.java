package com.deepak.collectionSorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Employee4 implements Comparable<Employee4> {
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

	public Employee4(Long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee4 [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee4 emp) {
		int i = (int) (this.empId - emp.empId);
		if (i == 0)
			i = this.empName.compareTo(emp.empName);
		return i;
	}

}

class Employee4Details {
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

	public Employee4Details(Long empId, String empEmail, int salary, int age, String city) {
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
		return "Employee4Details [empId=" + empId + ", empEmail=" + empEmail + ", salary=" + salary + ", age=" + age
				+ ", city=" + city + "]";
	}
}

public class MapSortByKeyWithTreeMap {
	public static void main(String[] args) {
		Employee4 emp1 = new Employee4(new Long(444), "Deepak");
		Employee4 emp2 = new Employee4(new Long(222), "Ankit");
		Employee4 emp3 = new Employee4(new Long(111), "Dharampal");
		Employee4 emp4 = new Employee4(new Long(555), "Rahul");
		Employee4 emp5 = new Employee4(new Long(333), "Sonu");

		Employee4Details empDt1 = new Employee4Details(new Long(222), "ankit@gmail.com", 500000, 25, "Orai");
		Employee4Details empDt2 = new Employee4Details(new Long(444), "deepak@gmail.com", 5000, 26, "Lucknow");
		Employee4Details empDt3 = new Employee4Details(new Long(111), "dharampal@gmail.com", 78000, 24, "Panjab");
		Employee4Details empDt4 = new Employee4Details(new Long(333), "sonu@gmail.com", 50002, 23, "Kanpur");
		Employee4Details empDt5 = new Employee4Details(new Long(555), "rahul@gmail.com", 300000, 25, "Unnao");

		Map<Employee4, Employee4Details> unMap = new HashMap<>();
		unMap.put(emp1, empDt1);
		unMap.put(emp2, empDt2);
		unMap.put(emp3, empDt3);
		unMap.put(emp4, empDt4);
		unMap.put(emp5, empDt5);
		System.out.println("------------------UnSorted Map-----------------------------");
		printMap(unMap);
		System.out.println("************************************************************");
		System.out.println("-------------Sorted Map By Key Using TreeMap()-------------------");
		Map<Employee4, Employee4Details> sortMap = new TreeMap<Employee4, Employee4Details>(unMap);
		printMap(sortMap);
	}

	public static void printMap(Map<Employee4, Employee4Details> map) {
		for (Map.Entry<Employee4, Employee4Details> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "....." + entry.getValue());
		}
	}
}