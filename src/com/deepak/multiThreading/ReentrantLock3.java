package com.deepak.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

class MyTh extends Thread
{
  static ReentrantLock l=new ReentrantLock();
  MyTh(String name) {
		super(name);
	}

  public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " .....got lock and performing safe opration");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName()
					+ "   ..... unnable to get lock and performing alternative  opration");
		}
	}
}

public class ReentrantLock3 {
	public static void main(String[] args) {
		MyTh t1 = new MyTh("First Thraed");
		MyTh t2 = new MyTh("Second Thraed");
		t1.start();
		t2.start();
	}
}
