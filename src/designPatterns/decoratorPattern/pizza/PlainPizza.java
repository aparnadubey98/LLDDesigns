package designPatterns.decoratorPattern.pizza;

public class PlainPizza implements Pizza {
    @Override
    public double getCost() {
        return 5.00;
    }
}
