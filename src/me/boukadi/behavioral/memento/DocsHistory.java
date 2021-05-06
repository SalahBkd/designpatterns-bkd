package me.boukadi.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class DocsHistory {

    List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
