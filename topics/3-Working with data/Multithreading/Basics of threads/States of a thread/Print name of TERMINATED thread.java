import java.util.Arrays;

class ThreadUtil {
    static void printNameOfTerminatedThread(Thread[] threads) {
        Arrays.stream(threads)
                .filter(thread -> thread.getState() == Thread.State.TERMINATED)
                .forEach(thread -> System.out.println(thread.getName()));
    }
}