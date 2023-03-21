    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sequenceLimit = scanner.nextInt();
            int result = 0;
            if (sequenceLimit % 4 == 0) {
                result = sequenceLimit;
            }
            while (scanner.hasNext()) {
                int tmp = scanner.nextInt();
                if (tmp % 4 == 0 && tmp > result) {
                    result = tmp;
                }
                sequenceLimit = tmp;
            }
            System.out.println(result);
        }
    }
