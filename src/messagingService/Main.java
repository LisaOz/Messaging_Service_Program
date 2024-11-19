package messagingService;

public class Main {

	public static void main(String[] args) {

// Creating a messaging service
		MessagingService messagingService = new MessagingService();
		
		// Creating messages
		
		Message message1 = new Message("Alice", "Hello everyone! This is a test message from Alice, and it is too long to be added".repeat(10)); // message exceeds 280 characters
		Message message2 = new Message("Bob", "This is a test message from Bob");
		Message message3 = new Message("Tom", "This is a test message from Tom");
		Message message4 = new Message("Charlie", "This is a test message from Charlie");
		
// Adding messages to the service
		messagingService.add(message1); // this message should not be added
		messagingService.add(message2);
		messagingService.add(message3);
		messagingService.add(message4);
		
// Retrieving and printing messages
		System.out.println("Messages in the service:");
		for (Message msg : messagingService.getMessages()) {
			System.out.println(msg);
		}
	}
}
