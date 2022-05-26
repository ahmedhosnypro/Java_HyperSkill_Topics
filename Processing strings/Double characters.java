import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(sb);
    }
}