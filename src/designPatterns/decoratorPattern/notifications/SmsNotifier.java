package designPatterns.decoratorPattern.notifications;

public class SmsNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }

}
