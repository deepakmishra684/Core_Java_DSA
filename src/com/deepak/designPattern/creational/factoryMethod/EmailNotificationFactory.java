package com.deepak.designPattern.creational;

import com.deepak.designPattern.creational.factoryMethod.EmailNotification;
import com.deepak.designPattern.creational.factoryMethod.Notification;
import com.deepak.designPattern.creational.factoryMethod.NotificationFactory;

public class EmailNotificationFactory extends NotificationFactory {
	public Notification createNotification() {
		return new EmailNotification();
	}
}
