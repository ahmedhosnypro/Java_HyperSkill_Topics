import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int wantedSeed = 0;
        int lastMaxRandom = Integer.MAX_VALUE;
        int minMaxRandom = Integer.MIN_VALUE;
        int currentRandom = 0;
        int currentMaxRandom;
        int currentMinRandom;
        for (int i = A; i <= B; i++) {
            Random random = new Random(i);
            currentMaxRandom = random.nextInt(K);

            for (int j = 0; j < N - 1; j++) {
                currentRandom = random.nextInt(K);
                currentMaxRandom = Math.max(currentRandom, currentMaxRandom);
            }
            minMaxRandom = Math.min(lastMaxRandom, currentMaxRandom);
            if (lastMaxRandom > minMaxRandom) {
                wantedSeed = i;
            }
            lastMaxRandom = minMaxRandom;
        }

        System.out.println(wantedSeed);
        System.out.println(minMaxRandom);
    }
}