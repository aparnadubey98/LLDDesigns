package designPatterns.interpretDesignPattern;

public class Main {
    public static void main(String[] args){
        Context context = new Context();
        context.addVariable("a", 1);
        context.addVariable("b", 2);

        AbstractExpression expression = new MultiplyNonTerminalExpression(
                new AddNonTerminalExpression(
                        new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new NumberTerminalExpression("b"));

        System.out.println("Result: " + expression.interpret(context));
    }
}
