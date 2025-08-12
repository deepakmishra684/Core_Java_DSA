package com.deepak.designPattern;

public class DualInstance {

	private static DualInstance instance1 = null;
	private static DualInstance instance2 = null;

	private DualInstance() {
	}

	private static int callOut = 0;

	public static DualInstance getInstance() {
		++callOut;
		if (instance1 == null) {
			instance1 = new DualInstance();
			System.out.println("instance1 :: " + instance1.hashCode());
			return instance1;
		}
		if (instance2 == null) {
			instance2 = new DualInstance();
			System.out.println("instance2 :: " + instance2.hashCode());
			return instance2;
		}
		return (callOut % 2 == 1) ? instance1 : instance2;
	}

	public void showInstanceName() {
		System.out.println(
				this == instance1 ? "Instance1:: " + instance1.hashCode() : "Instance2 ::" + instance2.hashCode());
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			DualInstance obj = getInstance();
			System.out.print("Call " + i + ": ");
			obj.showInstanceName();
		}
	}
}
