package org.mediator;

public class Main {
    public static void main(String[] args) {

        // Instantiate three visitors
       var john = new Visitor("Smith");
       var bob = new Visitor("Uncle Bob");
       var doe = new Visitor("Doe");

       // have all three visitors join one room
        var chatroom = new Chatroom();
        john.enter(chatroom);
        bob.enter(chatroom);
        doe.enter(chatroom);

        // John sends a greeting
        john.send("Hello everyone");
        // Bob sends a reply
        bob.send("Welcome to the chatroom Smith");
        // Doe sends a reply
        doe.send("Hi Smith, nice to meet you");

    }
}