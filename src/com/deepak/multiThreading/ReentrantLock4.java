package com.deepak.multiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread21 extends Thread {
	static ReentrantLock l = new ReentrantLock();

	MyThread21(String name) {
		super(name);
	}

	public void run() {
		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " .....got lock");

					Thread.sleep(30000);

					l.unlock();
					System.out.println(Thread.currentThread().getName() + " .....release lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName()
							+ "   ..... unnable to get lock and performing alternative  opration");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}
}

public class ReentrantLock4 {
	public static void main(String[] args) {
		MyThread21 t1 = new MyThread21("First Thread");
		MyThread21 t2 = new MyThread21("Second Thread");
		t1.start();
		t2.start();
	}
}
