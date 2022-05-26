package threads;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueEx {

    public static void main(String[] args) throws InterruptedException {
        // assigning thread-safe implementation
        Queue<Integer> numbers = new ConcurrentLinkedQueue<>();

        Thread writer = new Thread(() -> addNumbers(numbers));
        writer.start();

        addNumbers(numbers); // add number from the main thread

        writer.join(); // wait for writer thread

        System.out.println(numbers.size()); // it prints 200000
    }

    private static void addNumbers(Queue<Integer> target) {
        for (int i = 0; i < 100_000; i++) {
            target.add(i);
        }
    }
}