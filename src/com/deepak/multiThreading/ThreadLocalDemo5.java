package com.deepak.multiThreading;

class ParentThread1 extends Thread {
	public static InheritableThreadLocal l1 = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};

	public void run() {
		l1.set("PT");
		System.out.println("ParentThread1 value--" + l1.get());
		ChildThread1 ct = new ChildThread1();
		ct.start();

	}
}

class ChildThread1 extends Thread {

	public void run() {
		System.out.println("ChildThread1 value--" + ParentThread1.l1.get());
	}
}

public class ThreadLocalDemo5 {
	public static void main(String[] args) {
		ParentThread1 pt = new ParentThread1();
		pt.start();
	}
}

/*
 * Note:--In the above program if we replace InheritableThreadLocal with
 * ThreadLocal and if we are not overriding childValue() method then the output
 * is ParentThread1 value PT and ChildThread1 value is null
 */