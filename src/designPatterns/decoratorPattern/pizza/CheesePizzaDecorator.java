package designPatterns.decoratorPattern.pizza;

public class CheesePizzaDecorator extends PizzaDecorator {
    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50; // Adding cheese cost
    }
}
