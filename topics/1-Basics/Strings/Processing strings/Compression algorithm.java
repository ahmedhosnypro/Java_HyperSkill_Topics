import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char current = input.charAt(0);
        int count = 1;
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if (tmp == current) {
                count++;
                continue;
            } else {
                output.append(current).append(count);
                current = tmp;
                count = 1;
            }
        }
        output.append(current).append(count);
        System.out.println(output);
    }
}