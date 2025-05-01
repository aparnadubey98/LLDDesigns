package designPatterns.interpretDesignPattern;

public class AddNonTerminalExpression implements AbstractExpression {
    private final AbstractExpression leftExpression;
    private final AbstractExpression rightExpression;

    public AddNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
