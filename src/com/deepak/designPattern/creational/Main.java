package com.deepak.designPattern.creational;

public class Main {
	public static void main(String[] args) {
		NotificationFactory factory;

		factory = new EmailNotificationFactory();
		factory.notifyNow();

		factory = new SMSNotificationFactory();
		factory.notifyNow();
	}
}
