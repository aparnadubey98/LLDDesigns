package designPatterns.commandDesignPattern;

public class TurnOnACCommand implements Command {
    private final AirConditioner airConditioner;

    public TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
