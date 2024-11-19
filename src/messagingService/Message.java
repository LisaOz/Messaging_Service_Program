package messagingService;

import java.util.ArrayList;

public class Message {
	private String sender;
	private String content;
	
	
	public Message(String sender, String content) {
		this.sender = sender;
		this.content = content;
		
		
		}
	public String getSender() {
		return sender;
		
	}
	public String getContent() {
		return content;
	}
	
	public String toString() {
		return "Sender " + this.sender + " sent this message: " + this.content;
	}

}
