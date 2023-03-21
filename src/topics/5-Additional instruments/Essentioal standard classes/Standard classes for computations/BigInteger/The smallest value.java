import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        BigInteger positiveInput = new BigInteger(s);

        BigInteger smallest = BigInteger.ONE;
        BigInteger result = BigInteger.ONE;
        while (result.compareTo(positiveInput) <= 0 && result.compareTo(positiveInput) != 0) {
            result = smallest.multiply(result);
            smallest = smallest.add(BigInteger.ONE);
        }
        smallest = smallest.subtract(BigInteger.ONE);
        System.out.println(smallest);
    }
}