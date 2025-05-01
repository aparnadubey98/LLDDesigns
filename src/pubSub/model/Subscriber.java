package pubSub.model;

public class Subscriber {
    private final String name;
    private final String topic;

    public Subscriber(String name, String topic) {
        this.name = name;
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public void receiveMessage(String message) {
        System.out.println("Subscriber " + name + " received message: " + message);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
