package com.deepak.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreeThreadSum {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exicutor = Executors.newFixedThreadPool(3);

		Callable<Integer> task1 = () -> {
			Thread.sleep(2000);
			return 10;
		};

		Callable<Integer> task2 = () -> {
			Thread.sleep(2000);
			return 20;
		};

		Callable<Integer> task3 = () -> {
			Thread.sleep(2000);
			return 30;
		};

		Future<Integer> result1 = exicutor.submit(task1);
		Future<Integer> result2 = exicutor.submit(task2);
		Future<Integer> result3 = exicutor.submit(task3);

		int total = result1.get() + result2.get() + result3.get();
		System.out.println("Result:: " + total);
		exicutor.shutdown();
	}

}
