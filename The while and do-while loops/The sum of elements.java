import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
