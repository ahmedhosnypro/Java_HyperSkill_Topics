import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intMonth = scanner.nextInt();

        String strMonth;
        strMonth = switch (intMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            default -> "error!";
        };

        System.out.println(strMonth);
    }
}
