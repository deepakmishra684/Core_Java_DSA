package com.deepak.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {
	ReentrantLock l = new ReentrantLock();

	public String name;

	MyThread(String name) {
		this.name = name;
	}

	public void run() {
		wish(name);
	}

	public void wish(String name) {
		l.lock();
		for (int i = 0; i < 5; i++) {
			System.out.print("GoodMorning  : ");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();
	}
}

public class ReentrantLock2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Deepak");
		MyThread t2 = new MyThread("Ankit");
		t1.start();
		t2.start();
	}
}
