package threads;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class ConcurrentLinkedQueue_GeneratorDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        Thread generator = new Thread(() -> {
            try {
                queue.add(10);
                TimeUnit.MILLISECONDS.sleep(10);
                queue.add(20);
                TimeUnit.MILLISECONDS.sleep(10);
                queue.add(30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread poller = new Thread(() -> {
            int countRead = 0;
            while (countRead != 3) {
                Integer next = queue.poll();
                if (next != null) {
                    countRead++;
                }
                System.out.println(next);
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        generator.start();
        poller.start();
    }
}