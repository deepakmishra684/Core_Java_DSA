package com.deepak.designPattern.creational;

public abstract class NotificationFactory {

	public abstract Notification createNotification();

	public void notifyNow() {
		Notification notification = createNotification();
		notification.notifyUser();
	}
}
