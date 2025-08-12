package com.deepak.java8coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmpByDept {

	public static Map<String, Employe> highestPaidByDept(List<Employe> employees) {
		return employees.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employe::getSalary)), Optional::get)));
		// Optional::get ->only use if you're sure each department has at least one
		// employee
	}

	public static void main(String[] args) {
		List<Employe> employees = Arrays.asList(new Employe("Alice", "HR", 70000), new Employe("Bob", "HR", 75000),
				new Employe("Carol", "IT", 90000), new Employe("Dave", "IT", 85000),
				new Employe("Eve", "Sales", 80000));
		System.out.println(highestPaidByDept(employees));
	}
}
