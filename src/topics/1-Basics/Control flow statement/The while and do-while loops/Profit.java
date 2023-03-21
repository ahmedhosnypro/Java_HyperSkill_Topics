import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        double profit = scanner.nextDouble();
        double limit = scanner.nextDouble();
        int year = 0;
        while (money < limit) {
            money += money * profit / 100;
            year++;
        }
        System.out.println(year);
    }
}