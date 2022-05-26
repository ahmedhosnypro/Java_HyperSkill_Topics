import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fstDigit = scanner.nextInt();
        while (fstDigit >= 10) {
            fstDigit /= 10;
        }
        System.out.println(fstDigit);
    }
}