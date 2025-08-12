package com.deepak.multiThreading;

class Test1 {
	public synchronized void test1(Test2 t2) {
		System.out.println("Thread 1 start to execution of  test1() method...");
		t2.fun2();
	}

	public synchronized void fun1() {
		System.out.println("Inside Test1 this is fun1() method...");
	}

}

class Test2 {
	public synchronized void test2(Test1 t1) {
		System.out.println("Thread 2 start to execution of  test2() method...");
		t1.fun1();
	}

	public synchronized void fun2() {
		System.out.println("Inside Test2 this is fun2() method...");
	}

}

public class DeadLockExample extends Thread {
	Test1 t1 = new Test1();
	Test2 t2 = new Test2();

	public void driver() {
		this.start();
		t1.test1(t2);
	}

	public void run() {
		t2.test2(t1);
	}

	public static void main(String[] args) {
		DeadLockExample dl = new DeadLockExample();
		dl.driver();
	}
}
