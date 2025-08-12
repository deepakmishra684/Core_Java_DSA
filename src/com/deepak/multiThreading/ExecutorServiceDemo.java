package com.deepak.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;

	PrintJob(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + "......jobstarted by Thread:" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "....job completed by Thread:" + Thread.currentThread().getName());
	}
}

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("deepak"),
				            new PrintJob("ankit"),
				            new PrintJob("chandu"),
				            new PrintJob("sumit"),
				            new PrintJob("dharam"),
				            new PrintJob("abhi") };
		// We can replace any number with 4
		ExecutorService service = Executors.newFixedThreadPool(4);
		for (PrintJob job : jobs) {
			service.submit(job);

		}
		service.shutdown();
	}
}
