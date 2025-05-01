package designPatterns;

import designPatterns.momentoDesignPattern.Momento;
import java.util.Stack;

public class Caretaker {
    Stack<Momento> momentos;

    // Stack to hold the moments
    public Caretaker() {
        this.momentos = new Stack<>();
    }

    public void addMomento(Momento momento) {
        momentos.push(momento);
    }

    public Momento undo() {
        if (!momentos.isEmpty()) {
            return momentos.pop();
        }
        return null;
    }

}
