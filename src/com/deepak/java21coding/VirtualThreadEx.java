package com.deepak.java21coding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExample {
    public static void main(String[] args) {

        // ExecutorService where each task gets its own virtual thread
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 1; i <= 10; i++) {
            int taskId = i;

            executor.submit(() -> {
                System.out.println("Virtual Thread: " + Thread.currentThread());
                try {
                    Thread.sleep(1000); // blocking (but lightweight)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Completed Task: " + taskId);
            });
        }

        executor.shutdown();
    }
}

