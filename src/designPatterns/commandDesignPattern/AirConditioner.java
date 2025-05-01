package designPatterns.commandDesignPattern;

public class AirConditioner {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Air Conditioner is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air Conditioner is turned OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
