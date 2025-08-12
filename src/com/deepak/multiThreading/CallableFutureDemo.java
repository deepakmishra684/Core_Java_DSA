package com.deepak.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Object> {
	int num;

	MyCallable(int num) {
		this.num = num;
	}

	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() 
				            + " is ..... responsible to find sum of first " + num + " numbers");
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
public class CallableFutureDemo {
	public static void main(String[] args) throws Exception {
		MyCallable[] jobs = { new MyCallable(5),
				              new MyCallable(10),
				              new MyCallable(15),
				              new MyCallable(20),
				              new MyCallable(25), 
				              new MyCallable(30),
				              new MyCallable(35) };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable job : jobs) {
			Future f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
