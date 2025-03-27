package multithreading.producerConsumer;

import java.util.Queue;

public class SharedResource {
    private final Queue<Integer> queue;

    public SharedResource(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void produce(int value) {
        synchronized (queue) {
            while (queue.size() == 5) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add(value);
            queue.notifyAll();
        }
    }

    public void consume() {
        synchronized (queue) {
            while (queue.isEmpty()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Consumed: " + queue.poll());
            queue.notifyAll();
        }
    }
}
