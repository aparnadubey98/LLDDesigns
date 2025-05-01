package designPatterns.decoratorPattern.pizza;

public class VegetablePizzaDecorator extends PizzaDecorator {
    public VegetablePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.00; // Adding vegetable cost
    }
}
