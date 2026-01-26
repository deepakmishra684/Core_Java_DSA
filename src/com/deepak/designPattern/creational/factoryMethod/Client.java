package com.deepak.designPattern.creational.factoryMethod;

import com.deepak.designPattern.creational.factoryMethod.EmailNotificationFactory;
import com.deepak.designPattern.creational.factoryMethod.NotificationFactory;
import com.deepak.designPattern.creational.factoryMethod.SMSNotificationFactory;

public class Main {
	public static void main(String[] args) {
		NotificationFactory factory;

		factory = new EmailNotificationFactory();
		factory.notifyNow();

		factory = new SMSNotificationFactory();
		factory.notifyNow();
	}
}
