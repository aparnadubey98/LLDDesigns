package designPatterns.momentoDesignPattern;

public class State {
    private int x, y;

    public State(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "State{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
