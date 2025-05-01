package designPatterns.momentoDesignPattern;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState(1, 2);
        originator.getState();

        originator.setState(3, 4);
        originator.getState();

        originator.undo();
        originator.getState();

        originator.undo();
        originator.getState();
    }
}
