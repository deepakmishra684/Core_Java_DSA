package com.deepak.langPackage;

class Address1 {
	String houseNumber = "67/E";
	String streetName = "4th main";
	String city = "Banglore";

	public String toString() {
		return "houseNumber :" + houseNumber + "    streetName :" + streetName + "    city :" + city;
	}

}

class Employee1 implements Cloneable {
	String eName = "Deepak";
	String id = "A12";
	Address1 address = new Address1();

	public String toString() {
		return "eName :" + eName + "    id :" + id;
	}

	public Employee1 clone() throws CloneNotSupportedException {
		return (Employee1) super.clone();

	}
}

public class ShallowCloneManager {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 emp1 = new Employee1();
		System.out.println("---------Original Object---------");
		System.out.println(emp1);
		System.out.println(emp1.address);
		System.out.println("hashCode of emp1 :: " + emp1.hashCode());

		Employee1 emp2 = (Employee1) emp1.clone(); // Cloning process

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