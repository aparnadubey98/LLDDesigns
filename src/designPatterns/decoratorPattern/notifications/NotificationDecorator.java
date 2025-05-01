package designPatterns.decoratorPattern.notifications;

public abstract class NotificationDecorator implements Notifier {
    protected Notifier notifier;

    public NotificationDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
