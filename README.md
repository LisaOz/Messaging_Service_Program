# Messaging_Service_Program
The **Messaging Service Program** is a simple Java application that allows users to create and manage a messaging system. 
It consists of two main components:
1. **Message Class**: Represents individual messages, each with the sender and content.
2. **MessagingService Class**: Manages a collection of messages, allowing users to add new messages, if their content does not exceed the set limit (280 characters), and retrieve the stored messages.

This program demonstrates onject-oriented programming principle of encapsulation.

## Features
**Message Class**: 
- represents a message with a sender (String) and a content (String);
- provides methods getSender() and getContent() to retrieve the sender and content of the message;
- contains toString() methods to display the messages.

**MessagingService Class**:
- Manages a list of Message objects;
- Allows adding messages if their content is at most 280 characters with *add()* method;
- Provides a method *getMessages()* to retrieve all stored messages.

## How to Run the Program
Close the repository, compile the program using your IDE or the command line (javac), and run the Main claas to test the messaging functionality.

## Future improvements
- The functionality to delete specific messages can be added.
- Features to search messages by sender or content can be implemented.
- Saving messages to a file or a database can be implemented with additional code.

## License
This project is released under the MIT License. See LICENSE for details.
Feel free to adjust the content by adding any additional features.



