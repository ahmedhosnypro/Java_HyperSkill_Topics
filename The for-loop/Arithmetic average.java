import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        double sum = 0;
        int cnt = 0;
        for (int i = numA; i <= numB; i++) {
            if (i % 3 == 0) {
                cnt++;
                sum += i;
            }
        }
        double average = sum / cnt;
        System.out.println(average);
    }
}