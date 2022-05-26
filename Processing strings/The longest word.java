import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");

        int indexOfLongest = 0;
        int longest = 0;
        for (int i = 0; i < words.length; i++) {
            int tmp = words[i].length();
            if (tmp > longest) {
                longest = tmp;
                indexOfLongest = i;
            }
        }
        System.out.println(words[indexOfLongest]);
    }
}