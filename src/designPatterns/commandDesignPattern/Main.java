package designPatterns.commandDesignPattern;

public class Main {
    public static void main(String args[]){
        AirConditioner ac = new AirConditioner();
        Command turnOnAC = new TurnOnACCommand(ac);
        Command turnOffAC = new TurnOffACCommand(ac);

        AirConditionerRemote remote = new AirConditionerRemote();
        remote.setCommand(turnOnAC);
        remote.pressButton(); // Output: Air Conditioner is turned ON

        remote.setCommand(turnOffAC);
        remote.pressButton(); // Output: Air Conditioner is turned OFF
    }
}
