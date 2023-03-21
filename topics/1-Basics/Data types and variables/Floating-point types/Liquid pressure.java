import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double liquidPressure = scanner.nextDouble();
        double height = scanner.nextDouble();
        double gravity = 9.8;
        double Pressure = liquidPressure * gravity * height;
        System.out.println(Pressure);
    }
}