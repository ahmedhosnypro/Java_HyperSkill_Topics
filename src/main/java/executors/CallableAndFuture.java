package executors;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<Integer> future1 = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 700000;
        });

        Future<Integer> future2 = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 900000;
        });

        int result = future1.get() + future2.get(); // waiting for both results

        System.out.println(result); // 1600000

        executor.shutdown();

        ExecutorService executor1 = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> callables =
                List.of(() -> 1000, () -> 2000, () -> 1500); // three "difficult" tasks

        List<Future<Integer>> futures = executor1.invokeAll(callables);
        int sum = 0;
        for (Future<Integer> future : futures) {
            sum += future.get(); // blocks on each future to get a result
        }
        System.out.println(sum);
        executor1.shutdown();
    }
}
