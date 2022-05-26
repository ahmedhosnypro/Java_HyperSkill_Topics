package threads;

class Runner{
    public static void main(String[] args) throws InterruptedException {
        SynchronizedCounter counter = new SynchronizedCounter();

        Worker1 worker1 = new Worker1(counter);
        Worker1 worker2 = new Worker1(counter);

        worker1.start();
        worker2.start();

        worker1.join();
        worker2.join();

        System.out.println(counter.getValue()); // the result is 20_000_000
    }
}
class SynchronizedCounter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getValue() {
        return count;
    }
}

class Worker1 extends Thread {

    private final SynchronizedCounter counter;

    public Worker1(SynchronizedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            counter.increment();
        }
    }
}

class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        SomeThreadStaticSynchronizedMethods thread0 = new SomeThreadStaticSynchronizedMethods("Thread-0");
        SomeThreadStaticSynchronizedMethods thread1 = new SomeThreadStaticSynchronizedMethods("Thread-1");

        thread0.start();
        thread1.start();
        thread0.join();
        thread1.join();

        System.out.println();

        InstanceSynchronizedMethods instance1 = new InstanceSynchronizedMethods("instance-1");
        InstanceSynchronizedMethods instance2 = new InstanceSynchronizedMethods("instance-2");
        SomeThreadInstanceSynchronizedMethods thread2 = new SomeThreadInstanceSynchronizedMethods("Thread-2", instance1);
        SomeThreadInstanceSynchronizedMethods thread3 = new SomeThreadInstanceSynchronizedMethods("Thread-3", instance1);
        SomeThreadInstanceSynchronizedMethods thread4 = new SomeThreadInstanceSynchronizedMethods("Thread-4", instance2);

        thread2.start();
        thread3.start();
        thread4.start();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}


class StaticSynchronizedMethods {

    public static synchronized void doSomething() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s entered the method%n", threadName);
        System.out.printf("%s leaves the method%n", threadName);
    }
}

class SomeThreadStaticSynchronizedMethods extends Thread {
    public SomeThreadStaticSynchronizedMethods(String name) {
        super(name);
    }

    @Override
    public void run() {
        StaticSynchronizedMethods.doSomething();
    }
}

class InstanceSynchronizedMethods {

    private final String name;

    public InstanceSynchronizedMethods(String name) {
        this.name = name;
    }

    public synchronized void doSomething() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s entered the method of %s%n", threadName, name);
        System.out.printf("%s leaves the method of %s%n", threadName, name);
    }
}

class SomeThreadInstanceSynchronizedMethods extends Thread {
    private final InstanceSynchronizedMethods object;

    public SomeThreadInstanceSynchronizedMethods(String name, InstanceSynchronizedMethods object) {
        super(name);
        this.object = object;
    }

    @Override
    public void run() {
        object.doSomething();
    }
}

class SynchronizedBlocks {

    public static void staticMethod() {

        // unsynchronized code

        synchronized (SynchronizedBlocks.class) { // synchronization on the class
            // synchronized code
        }
    }

    public void instanceMethod() {

        // unsynchronized code

        synchronized (this) { // synchronization on this instance
            // synchronized code
        }
    }
}

class Fine_grainedSynchronization {

    private int numberOfCallingMethod1 = 0;
    private int numberOfCallingMethod2 = 0;

    final Object lock1 = new Object(); // an object for locking
    final Object lock2 = new Object(); // another object for locking

    public void method1() {
        System.out.println("method1...");

        synchronized (lock1) {
            numberOfCallingMethod1++;
        }
    }

    public void method2() {
        System.out.println("method2...");

        synchronized (lock2) {
            numberOfCallingMethod2++;
        }
    }
}