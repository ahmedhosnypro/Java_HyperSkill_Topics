import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] orgArray = new int[rows][cols];
        int[][] rotatedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                orgArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                int k = rows - 1 - j;
                int m = i;
                rotatedArray[i][j] = orgArray[k][m];
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }


}