package com.deepak.multiThreading;

public class ThreadGroupDemo1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		/*
		 * now we creating thread group so this is subGroupThread of
		 * mainThreadGroup becouse we creating inside main thread group
		 */
		System.out.println("*****************************************");
		ThreadGroup g1 = new ThreadGroup("First THread Group");
		System.out.println(g1.getParent().getName());
		ThreadGroup g2 = new ThreadGroup(g1, "Sub Thread group of First Thraed Grop");
		System.out.println(g2.getParent().getName());
		System.out.println("*****************************************");
		Thread t1 = new Thread(g1, "Thread1");
		Thread t2 = new Thread(g1, "Thread2");
		System.out.println(g1.getMaxPriority());
		System.out.println("*************************************");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1, "Thraed3");
		System.out.println(g1.getMaxPriority());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		g1.list();
	}
}
