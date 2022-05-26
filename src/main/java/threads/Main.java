package threads;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello threads.Main");

        HelloThread2 t2 = new HelloThread2();
        t2.start();

        HelloThread1 t1 = new HelloThread1();
        t1.start();
    }
}
