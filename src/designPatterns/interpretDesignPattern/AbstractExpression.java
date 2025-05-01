package designPatterns.interpretDesignPattern;

public interface AbstractExpression {
    public int interpret(Context context);
    // The interpret method takes a Context object as a parameter and performs the interpretation logic.
    // The Context object can hold information that is relevant to the interpretation process.
}
