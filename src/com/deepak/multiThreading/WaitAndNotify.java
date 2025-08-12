package com.deepak.multiThreading;

class Test3 extends Thread {
	public void run() {
		synchronized (this) {

			System.out.println("----- Even numbers ------");
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}

			}
			this.notify();
		}
	}
}

public class WaitAndNotify {
	public static void main(String[] args) throws InterruptedException {
		Test3 t = new Test3();
		t.start();
		synchronized (t) {
			t.wait();
			System.out.println("----- Odd Numbers----- ");
			for (int i = 1; i <= 10; i++) {
				if (i % 2 != 0)
					System.out.println(i);
			}

		}
	}
}
