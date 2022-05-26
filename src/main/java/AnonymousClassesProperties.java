import java.util.Scanner;

public class AnonymousClassesProperties {
    public static void main(String[] args) {

        Human human = new Human();
        human.takeMilkshake();

        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("Run, Forrest, run!");
            }
        });
    }
}



abstract class HumanThought {
    public void print() {
        System.out.println("This is a very important thought.");
    }
}

class Human {
    public void takeMilkshake() {
        // creation of anonymous class by inheriting from class HumanThought
        HumanThought thought = new HumanThought() {
            public void print() {
                System.out.println("What to take? Chocolate or strawberry milkshake..");
            }
        };
        thought.print();
    }
}


interface Callback {

    /**
     * Takes a result and processes it
     */
    void calculated(int result);

    /**
     * Takes an error message
     */
    void failed(String errorMsg);
}

class Divider {

    /**
     * Divide a by b. It executes the specified callback to process results
     */
    public static void divide(int a, int b, Callback callback) {

        if (b == 0) {
            callback.failed("Division by zero!");
            return;
        }

        callback.calculated(a / b);
    }
}

class CallbacksExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Divider.divide(a, b, new Callback() { // passing callback as an argument

            @Override
            public void calculated(int result) {
                String textToPrint = String.format("%d / %d is %d", a, b, result);
                print(textToPrint);
            }

            @Override
            public void failed(String errorMsg) {
                print(errorMsg);
            }
        });
    }

    public static void print(String text) {
        System.out.println(text);
    }
}