package com.deepak.multiThreading;

class Buffer1 {
	int data;
	boolean produce = false;

	synchronized void evenResource(int i) throws InterruptedException {
		if (produce) {
			wait();
		}

		System.out.println("Even :: " + i);
		produce = true;
		notify();
	}

	synchronized void oddResource(int i) throws InterruptedException {
		if (!produce) {
			wait();
		}
		System.out.println("Odd :: " + i);
		produce = false;
		notify();
	}
}

class Even extends Thread {
	Buffer1 buffer;

	public Even(Buffer1 buffer) {
		super();
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				try {
					buffer.evenResource(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class Odd extends Thread {

	Buffer1 buffer;

	public Odd(Buffer1 buffer) {
		super();
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0)
				try {
					buffer.oddResource(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

public class EvenAndOdd {
	public static void main(String[] args) {
		Buffer1 b = new Buffer1();
		Even e = new Even(b);
		Odd o = new Odd(b);
		e.start();
		o.start();
	}

}
