package com.deepak.multiThreading;

//to resolve this code in next ThreadLocalDemo5
class ParentThread extends Thread {
	public static ThreadLocal l1 = new ThreadLocal();

	public void run() {
		l1.set("PT");
		System.out.println("ParentThread--" + l1.get());
		ChildThread ct = new ChildThread();
		ct.start();

	}
}

class ChildThread extends Thread {

	public void run() {
		System.out.println("Child Thread value--" + ParentThread.l1.get());
	}
}

public class ThreadLocalDemo4 {
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
