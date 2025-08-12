package com.deepak.designPattern;

import java.util.Objects;

public final class EmployeeReocd {

	private final int empId;
	private final String name;

	public EmployeeReocd(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public EmployeeReocd checkObject(int empId, String name) {
		if (this.empId == empId && Objects.equals(this.name ,name)) {
			return this;
		} else
			return new EmployeeReocd(empId, name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeReocd other = (EmployeeReocd) obj;
		return empId == other.empId && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		EmployeeReocd amp1 = new EmployeeReocd(1, "Shivam");
		EmployeeReocd amp2 = amp1.checkObject(1, "Shivam");
		EmployeeReocd amp3 = new EmployeeReocd(2, "Shivam");
		EmployeeReocd amp4 = amp3.checkObject(2, "Deepak");
		EmployeeReocd amp5 = new EmployeeReocd(1, "Shivam");
		System.out.println(amp1.equals(amp2));
		System.out.println(amp3.equals(amp4));
		System.out.println(amp1.equals(amp5));
	}
}
