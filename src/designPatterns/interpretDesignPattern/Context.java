package designPatterns.interpretDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> variables;

    public Context() {
        this.variables = new HashMap<>();
    }

    // Method to add a variable to the context
    public void addVariable(String name, int value) {
        variables.put(name, value);
    }

    public int getVariable(String name) {
        return variables.get(name);
    }
}
