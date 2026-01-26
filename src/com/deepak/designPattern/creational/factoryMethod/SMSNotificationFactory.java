package com.deepak.designPattern.creational;

import com.deepak.designPattern.creational.factoryMethod.Notification;
import com.deepak.designPattern.creational.factoryMethod.NotificationFactory;
import com.deepak.designPattern.creational.factoryMethod.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
	public Notification createNotification() {
		return new SMSNotification();
	}
}
