import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine();

        System.out.println(regNum.matches("[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}"));
    }
}