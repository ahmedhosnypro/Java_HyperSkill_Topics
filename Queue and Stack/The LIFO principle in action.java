import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNums = Integer.parseInt(scanner.nextLine());

        LinkedList<String> queue = new LinkedList<>();
        for (int i = 0; i < inputNums; i++) {
            queue.addFirst(scanner.nextLine());
        }
        queue.forEach(System.out::println);
    }
}