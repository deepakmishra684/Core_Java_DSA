package com.deepak.langPackage;

final class Student {
	final private String name;
	final private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public Student objectModify(String name, int rollno) {
		if (this.name == name && this.rollNo == rollno) {
			return this;
		} else {
			return new Student(name, rollno);
		}
	}

}

public class MyImmutable {
	public static void main(String[] args) {
		Student st = new Student("deepak", 111);
		System.out.println(st.getName()+"  "+st.getRollNo());
		
		/*After modification there will be a new Oject cretaed*/
		
		Student st2=st.objectModify("Rahul", 222);
		System.out.println(st2.getName()+"  "+st2.getRollNo());
	}
}
