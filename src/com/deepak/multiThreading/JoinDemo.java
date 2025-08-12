package com.deepak.multiThreading;

class Test extends Thread {
	public void run() {
		System.out.println("Even numbers by Test Class..");
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}

public class JoinDemo {
	public static void main(String args[]) throws InterruptedException { // creating
		// thread.
		Test thrd1 = new Test();

		thrd1.start();
		thrd1.join();
		System.out.println("Odd numbers by Main Thread class...");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}
}
