package com.deepak.ioPackage;

import java.io.Serializable;

public class Customer implements Serializable {

	final int cust_Id;
	transient final String cust_Name;
	transient static String cust_Email = "a2gail.com";
	transient final int cust_Age = 10;
	transient int cust_SSN;

	public Customer(int cust_Id, String cust_Name, int cust_SSN) {
		this.cust_Id = cust_Id;
		this.cust_Name = cust_Name;
		this.cust_SSN = cust_SSN;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "Customer [cust_Id=" + cust_Id + ", cust_Name=" + cust_Name + ", cust_Age=" + cust_Age + ", cust_Email="
				+ cust_Email + ", cust_SSN=" + cust_SSN + "]";
	}
}
