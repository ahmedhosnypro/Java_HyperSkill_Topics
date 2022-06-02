package executors;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
    private static final int POOL_SIZE = Runtime.getRuntime().availableProcessors();
    private static final int NUMBER_OF_TASKS = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        // ExecutorService executor = Executors.newCachedThreadPool();
        // ExecutorService executor = Executors.newSingleThreadExecutor();
        ScheduledExecutorService ScheduledExecutor = Executors.newSingleThreadScheduledExecutor();

        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                String taskName = "task-" + taskNumber;
                String threadName = Thread.currentThread().getName();
                System.out.printf("%s executes %s%n", threadName, taskName);
            });
        }

        executor.submit(() -> {
            try {
                System.out.println(2 / 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        ScheduledExecutor.scheduleAtFixedRate(() -> System.out.println(LocalTime.now() + " Hello"), 10, 1, TimeUnit.MILLISECONDS);
        executor.shutdown();
        ScheduledExecutor.shutdown();
    }
}
