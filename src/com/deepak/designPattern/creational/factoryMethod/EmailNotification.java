package com.deepak.designPattern.creational;

import com.deepak.designPattern.creational.factoryMethod.Notification;

public class EmailNotification implements Notification {
	public void notifyUser() {
		System.out.println("Sending Email Notification");
	}
}
