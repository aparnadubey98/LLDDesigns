package designPatterns.decoratorPattern.notifications;

public class EmailNotifier extends NotificationDecorator {
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending email notification");
    }
}
