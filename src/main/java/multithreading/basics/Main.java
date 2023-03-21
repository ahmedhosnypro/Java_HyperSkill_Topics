package multithreading.basics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello multithreading.basics.Main");

        HelloThread2 t2 = new HelloThread2();
        t2.start();

        HelloThread1 t1 = new HelloThread1();
        t1.start();
    }
}
