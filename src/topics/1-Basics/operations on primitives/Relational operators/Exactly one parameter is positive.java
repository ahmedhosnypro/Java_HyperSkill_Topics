import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intA = scanner.nextInt();
        int intB = scanner.nextInt();
        int intC = scanner.nextInt();

        boolean bool1 = intA > 0 && intB <= 0 && intC <= 0;
        boolean bool2 = intB > 0 && intA <= 0 && intC <= 0;
        boolean bool3 = intC > 0 && intB <= 0 && intA <= 0;
        System.out.println(bool1 || bool2 || bool3);
    }
}
