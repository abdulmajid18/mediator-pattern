package org.mediator;

import java.util.ArrayList;
import java.util.List;

// he abstract chatroom class (the mediator)...
public abstract class AbstractChatroom {
    // the list of al current visitors

    protected List<AbstractVisitor>  activeVisitors = new ArrayList<>();

    // Send the specified message
    public abstract void send(String message, AbstractVisitor sender);

    // Register the specified visitor...
    public abstract void register(AbstractVisitor visitor);

    // Unregister the specified visitor...
    public abstract void unregister(AbstractVisitor visitor);
}
