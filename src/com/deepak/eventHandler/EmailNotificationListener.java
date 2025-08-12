package com.deepak.eventHandler;

@Component
public class EmailNotificationListener {
	@EventListener
    public void sendWelcomeEmail(UserRegisteredEvent event) {
        // Send email
        System.out.println("Sending welcome email to: " + event.getEmail());
    }
}
