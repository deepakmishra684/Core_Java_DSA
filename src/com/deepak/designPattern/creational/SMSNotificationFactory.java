package com.deepak.designPattern.creational;

public class SMSNotificationFactory extends NotificationFactory {
	public Notification createNotification() {
		return new SMSNotification();
	}
}
