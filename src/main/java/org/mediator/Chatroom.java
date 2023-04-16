package org.mediator;

public class Chatroom extends AbstractChatroom{
    // Send the specified message
    @Override
    public void send(String message, AbstractVisitor sender) {
        for (AbstractVisitor visitor: activeVisitors) {
            if (visitor != sender)
                visitor.receive(message);
        }
    }

    // Register the specified visitor...
    @Override
    public void register(AbstractVisitor visitor) {
        activeVisitors.add(visitor);
    }

    // Unregister the specified visitor...
    @Override
    public void unregister(AbstractVisitor visitor) {
        activeVisitors.remove(visitor);
    }
}
