import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int num = scanner.nextInt();
            if (num == 0)
                break;
            else numbers.add(num);
        }
        System.out.println(numbers.size());
    }
}