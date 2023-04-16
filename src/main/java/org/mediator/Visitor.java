package org.mediator;

// The visitor class (the concrete colleague)....
public class Visitor extends AbstractVisitor{

    // Initializes a new instance of the Visitor ....
    public Visitor(String name) {
        this.name = name;
    }

    // Receive a new message....
    @Override
    public void receive(String message) {
        System.out.printf("%s <---- %s \n", name, message);
    }
}
