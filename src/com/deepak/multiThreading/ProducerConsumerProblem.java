package com.deepak.multiThreading;

class Buffer {
	int data;
	boolean produce = false;

	synchronized void produce(int i) throws InterruptedException {
		if (produce) {
			System.out.println("Producer is waiting...");
			wait();
		}
		data = i;
		System.out.println("Product : " + data + " is produced.");
		produce = true;
		notify();
	}

	synchronized void consume() throws InterruptedException {
		if (!produce) {
			System.out.println("Consumer is waiting...");
			wait();
		}
		System.out.println("Product : " + data + " is consumed.");
		produce = false;
		notify();
	}

}

class Consumer extends Thread {
	Buffer b;

	Consumer(Buffer b) {
		this.b = b;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				b.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Producer extends Thread {
	Buffer b;

	Producer(Buffer b) {
		this.b = b;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			
				try {
					b.produce(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Buffer b = new Buffer();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();
	}
}
