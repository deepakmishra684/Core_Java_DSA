package com.deepak.designPattern;

public class RestrictObjectcreation {
	private static RestrictObjectcreation object;
	private static int objCount = 0;

	private RestrictObjectcreation() {
		objCount++;
		System.out.println(objCount);
	}

	public static RestrictObjectcreation getInstance() {

		if (objCount < 3) {

			object = new RestrictObjectcreation();

		}

		return object;

	}

	public static void main(String args[]) {

		RestrictObjectcreation obj1 = RestrictObjectcreation.getInstance();
		RestrictObjectcreation obj2 = RestrictObjectcreation.getInstance();
		RestrictObjectcreation obj3 = RestrictObjectcreation.getInstance();
		RestrictObjectcreation obj4 = RestrictObjectcreation.getInstance();
		RestrictObjectcreation obj5 = RestrictObjectcreation.getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
	}
}
