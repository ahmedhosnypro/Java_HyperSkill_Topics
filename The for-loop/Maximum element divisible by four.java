import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequence = scanner.nextInt();
        int num = scanner.nextInt();
        int result = 0;
        if (num % 4 == 0) {
            result = num;
        }
        for (int i = 0; i < sequence - 1; i++) {
            int currernt = scanner.nextInt();
            if (currernt % 4 == 0 && currernt > result) {
                result = currernt;
            }
            num = currernt;
        }
        System.out.println(result);
    }
}