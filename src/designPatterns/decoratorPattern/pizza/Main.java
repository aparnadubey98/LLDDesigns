package designPatterns.decoratorPattern.pizza;

public class Main {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println("Cost of plain pizza: " + plainPizza.getCost());

        Pizza cheesePizza = new CheesePizzaDecorator(plainPizza);
        System.out.println("Cost of cheese pizza: " + cheesePizza.getCost());

        Pizza vegetablePizza = new VegetablePizzaDecorator(cheesePizza);
        System.out.println("Cost of vegetable pizza: " + vegetablePizza.getCost());
    }
}
