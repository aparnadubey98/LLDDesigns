package multithreading.evenOddNumber;

public class PrintNumber {
    private int num;
    private int MaxNumber = 10;

    public PrintNumber(int N) {
        this.num = N;
    }

    public synchronized void printEvenNumber() {
        while (num < MaxNumber) {
            while (num % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even Number: " + num);
            num++;
            notify();
        }
    }

    public synchronized void printOddNumber() {
        while (num < MaxNumber) {
            while (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd Number: " + num);
            num++;
            notify();
        }
    }
}
