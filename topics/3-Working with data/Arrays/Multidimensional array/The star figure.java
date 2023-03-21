import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        String[][] intArray = new String[arraySize][arraySize];

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                int m = (arraySize + 1) / 2 - 1;
                if (i == j || i == m || j == m
                        || (i == arraySize - 1 - j && j == arraySize - 1 - i)) {//side Diagonal
                    intArray[i][j] = "*";
                    System.out.print("* ");
                } else {
                    intArray[i][j] = ". ";
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}