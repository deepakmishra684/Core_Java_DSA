package com.deepak.designPattern.creational;

public class EmailNotificationFactory extends NotificationFactory {
	public Notification createNotification() {
		return new EmailNotification();
	}
}
