package pubSub.messages;

import pubSub.model.Subscriber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic {
    private final String name;
    private List<Subscriber> subscribers;

    public Topic(String name) {
        this.name = name;
        subscribers = Collections.synchronizedList(new ArrayList<Subscriber>());
    }

    public String getName() {
        return name;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void sendMessage(final String message) {
        for (Subscriber subscriber : subscribers) {
            new Thread(() -> {
                subscriber.receiveMessage(message);
            }).start();
        }
    }

    public synchronized void publishMessage(String message) {
        System.out.println("Publishing message: " + message + " to topic: " + name);
        sendMessage(message);
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                '}';
    }
}
