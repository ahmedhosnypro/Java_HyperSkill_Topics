import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            int current = num % 10;
            sum += current;
            num /= 10;
        }
        System.out.println(sum);
    }
}