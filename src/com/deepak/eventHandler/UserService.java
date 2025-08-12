package com.deepak.eventHandler;

@Service
public class UserService {
	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void registerUser(String username, String email) {
		// Save user to DB (simplified)
		// userRepository.save(...);

		// Publish event
		UserRegisteredEvent event = new UserRegisteredEvent(username, email);
		eventPublisher.publishEvent(event);
	}
}
