package designPatterns.interpretDesignPattern;

public class NumberTerminalExpression implements AbstractExpression {
    private final String key;

    public NumberTerminalExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariable(key);
    }
}
