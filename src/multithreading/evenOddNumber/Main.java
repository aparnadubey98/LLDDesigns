package multithreading.evenOddNumber;

public class Main {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber(1);
        Thread t1 = new Thread(printNumber::printEvenNumber);
        Thread t2 = new Thread(printNumber::printOddNumber);
        t1.start();
        t2.start();
    }
}
