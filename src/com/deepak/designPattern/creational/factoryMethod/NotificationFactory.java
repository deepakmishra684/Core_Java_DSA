package com.deepak.designPattern.creational;

import com.deepak.designPattern.creational.factoryMethod.Notification;

public abstract class NotificationFactory {

	public abstract Notification createNotification();

	public void notifyNow() {
		Notification notification = createNotification();
		notification.notifyUser();
	}
}
