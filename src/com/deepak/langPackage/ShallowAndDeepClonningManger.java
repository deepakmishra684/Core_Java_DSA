package com.deepak.langPackage;

class Address implements Cloneable {
	String houseNumber = "67/E";
	String streetName = "4th main";
	String city = "Banglore";

	public String toString() {
		return "houseNumber :" + houseNumber + "    streetName :" + streetName + "    city :" + city;
	}

	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}

class Employee implements Cloneable {
	String eName = "Deepak";
	String id = "A12";
	Address address = new Address();

	public String toString() {
		return "eName :" + eName + "    id :" + id;
	}

	public Employee clone() throws CloneNotSupportedException {
		Employee emp2 = (Employee) super.clone(); 
		emp2.address = this.address.clone();
		return emp2;
	}
}

public class ShallowAndDeepClonningManger {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee();
		System.out.println("---------Original Object---------");
		System.out.println(emp1);
		System.out.println(emp1.address);
		System.out.println("hashCode of emp1 :: " + emp1.hashCode());

		Employee emp2 = (Employee) emp1.clone();  // Cloning process

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
