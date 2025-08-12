package com.deepak.multiThreading;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "  by MyThead-1");
			}
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i + "  by MyThead-2");
			}
		}
	}
}

public class YieldDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
		t1.yield();
	}
}
