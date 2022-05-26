import java.math.BigDecimal;
import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strN1 = scanner.nextLine();
        String strN2 = scanner.nextLine();

        BigDecimal num1 = new BigDecimal(strN1);
        BigDecimal num2 = new BigDecimal(strN2);

        BigDecimal multiply = num1.multiply(num2);
        System.out.println(multiply);
    }
}