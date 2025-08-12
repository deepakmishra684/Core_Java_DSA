package com.deepak.collectionSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Employee6 {
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

	public Employee6(Long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee6 [empId=" + empId + ", empName=" + empName + "]";
	}
}

class Employee6Details {
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

	public Employee6Details(Long empId, String empEmail, int salary, int age, String city) {
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
		return "Employee6Details [empId=" + empId + ", empEmail=" + empEmail + ", salary=" + salary + ", age=" + age
				+ ", city=" + city + "]";
	}

}

public class MapSortByValueWithComparator {
	public static void main(String[] args) {
		Employee6 emp1 = new Employee6(new Long(444), "Deepak");
		Employee6 emp2 = new Employee6(new Long(222), "Ankit");
		Employee6 emp3 = new Employee6(new Long(111), "Dharampal");
		Employee6 emp4 = new Employee6(new Long(555), "Rahul");
		Employee6 emp5 = new Employee6(new Long(333), "Sonu");

		Employee6Details empDt1 = new Employee6Details(new Long(111), "deepak@gmail.com", 5000, 25, "Orai");
		Employee6Details empDt2 = new Employee6Details(new Long(111), "deepak@gmail.com", 5000, 24, "Lucknow");
		Employee6Details empDt3 = new Employee6Details(new Long(111), "deepak@gmail.com", 5000, 24, "Panjab");
		Employee6Details empDt4 = new Employee6Details(new Long(111), "deepak@gmail.com", 5000, 24, "Kanpur");
		Employee6Details empDt5 = new Employee6Details(new Long(111), "deepak@gmail.com", 5000, 25, "Unnao");

		Map<Employee6, Employee6Details> unMap = new HashMap<Employee6, Employee6Details>();
		unMap.put(emp1, empDt1);
		unMap.put(emp2, empDt2);
		unMap.put(emp3, empDt3);
		unMap.put(emp4, empDt4);
		unMap.put(emp5, empDt5);
		System.out.println("------------------UnSorted Map-----------------------------");
		printMap(unMap);
		System.out.println("************************************************************");
		System.out.println("-------------Sorted Map on By Value Using Comparator-------------------");
		List<Map.Entry<Employee6, Employee6Details>> list = new LinkedList<>(unMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Employee6, Employee6Details>>() {
			public int compare(Entry<Employee6, Employee6Details> emp1, Entry<Employee6, Employee6Details> emp2) {
				int i = (int) (emp1.getValue().getEmpId() - emp2.getValue().getEmpId());
				if (i == 0)
					i = emp1.getValue().getEmpEmail().compareTo(emp2.getValue().getEmpEmail());
				if (i == 0)
					i = emp1.getValue().getSalary() - emp2.getValue().getSalary();
				if (i == 0)
					i = emp1.getValue().getAge() - emp2.getValue().getAge();
				if (i == 0)
					i = emp1.getValue().getCity().compareTo(emp2.getValue().getCity());
				return i;
			}
		});

		Iterator<Map.Entry<Employee6, Employee6Details>> itr = list.iterator();
		while (itr.hasNext()) {
			Entry<Employee6, Employee6Details> data = itr.next();
			System.out.println(data);
		}

	}

	public static void printMap(Map<Employee6, Employee6Details> map) {
		for (Map.Entry<Employee6, Employee6Details> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "....." + entry.getValue());
		}
	}
}