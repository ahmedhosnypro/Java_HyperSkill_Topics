import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int numD = scanner.nextInt();

        StringBuilder str = new StringBuilder("");

        for (int i = 0; i <= 1000; i++) {
            int cubic = i * i * i;
            int square = i * i;
            boolean bool = (numA * cubic + numB * square + numC * i + numD) == 0;

            if (bool) {
                str.append(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}