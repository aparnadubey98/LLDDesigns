package designPatterns.commandDesignPattern;

public class TurnOffACCommand implements Command {
    private final AirConditioner airConditioner;

    public TurnOffACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
