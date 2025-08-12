package com.deepak.multiThreading;

public class ThreadGroupDemo2 {
	public static void main(String[] args) {
		ThreadGroup sys = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[sys.activeCount()];
		sys.enumerate(t);
		for (Thread t1 : t) {
			System.out.println(t1.getName() + "  " + t1.isDaemon());
		}
	}
}
