import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        for (; begin <= end; begin++) {
            if (begin % 5 == 0 && begin % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (begin % 3 == 0) {
                System.out.println("Fizz");
            } else if (begin % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(begin);
            }
        }
    }
}