package com.deepak.langPackage;

class Address2 implements Cloneable {
	String houseNumber = "67/E";
	String streetName = "4th main";
	String city = "Banglore";

	public String toString() {
		return "houseNumber :" + houseNumber + "    streetName :" + streetName + "    city :" + city;
	}

	public Address2 clone() throws CloneNotSupportedException {
		return (Address2) super.clone();
	}
}

class Employee2 implements Cloneable {
	String eName = "Deepak";
	String id = "A12";
	Address2 address = new Address2();

	public String toString() {
		return "eName :" + eName + "    id :" + id;
	}

	public Employee2 clone() throws CloneNotSupportedException {
		Employee2 emp2 = (Employee2) super.clone();
		emp2.address = this.address.clone();
		return emp2;
	}
}

public class DeepCloneManager {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee2 emp1 = new Employee2();
		System.out.println("---------Original Object---------");
		System.out.println(emp1);
		System.out.println(emp1.address);
		System.out.println("hashCode of emp1 :: " + emp1.hashCode());

		Employee2 emp2 = (Employee2) emp1.clone(); // Cloning process

		System.out.println("---------Cloned Object---------");
		System.out.println(emp2);
		System.out.println(emp2.address);
		System.out.println("hashCode of emp2 :: " + emp2.hashCode());

		if (emp1.address == emp2.address) {
			System.out.println("Shallow Clonning");
		} else {
			System.out.println("Deep Clonning");
		}
	}
}
