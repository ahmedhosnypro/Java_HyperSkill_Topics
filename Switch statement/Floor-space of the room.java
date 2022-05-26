import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine().trim();
        double floorage = 0;
        double sideA, sideB, sideC, radius;
        switch (shape) {
            case "rectangle":
                sideA = Integer.parseInt(scanner.nextLine());
                sideB = Integer.parseInt(scanner.nextLine());
                floorage = sideA * sideB;
                break;
            case "triangle":
                sideA = Integer.parseInt(scanner.nextLine());
                sideB = Integer.parseInt(scanner.nextLine());
                sideC = Integer.parseInt(scanner.nextLine());
                double p = (sideA + sideB + sideC) / 2;
                floorage = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
                break;
            case "circle":
                radius = Integer.parseInt(scanner.nextLine());
                floorage = 3.14 * radius * radius;
                break;
            default:
                System.out.println("check input");
                break;
        }
        System.out.println(floorage);
    }
}