package com.deepak.eventHandler;

@Component
public class AuditListener {
	 @EventListener
	    public void handleUserRegistered(UserRegisteredEvent event) {
	        // Save audit log
	        System.out.println("Audit Log: User registered - " + event.getUsername());
	    }

}
