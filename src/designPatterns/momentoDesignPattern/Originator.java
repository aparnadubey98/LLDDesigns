package designPatterns.momentoDesignPattern;

import designPatterns.Caretaker;

public class Originator {
    private State state;
    private final Caretaker caretaker;

    public Originator() {
        this.caretaker = new Caretaker();
    }

    public void setState(int x, int y) {
        this.state = new State(x, y);
        caretaker.addMomento(new Momento(state));
    }

    public void getState() {
        System.out.println("Current State: " + state.toString());
    }

    public void undo() {
        Momento momento = caretaker.undo();
        if (momento != null) {
            this.state = momento.getState();
        }
    }
}
