package com.deepak.java17coding;

public class MainClass {
	public static void main(String[] args) {
		Shape s = new Circle(5);
		System.out.println("Area: " + s.area());
		
		Person person=new Person("Shivam",23);
		System.out.println(person.name()+" "+person.age());
		System.out.println(person.hashCode());
		Person person1=new Person("Shivam",23);
		System.out.println(person1.hashCode());
		Person person2=new Person("Deepak",23);
		System.out.println(person2.name()+" "+person2.age());
		System.out.println(person2.hashCode());
		System.out.println(person.equals(person1));
	}
}
