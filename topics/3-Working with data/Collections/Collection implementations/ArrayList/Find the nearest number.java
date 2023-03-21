import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        int N = scanner.nextInt();
        StringBuilder out = new StringBuilder();
        ArrayList<Integer> outInts = new ArrayList<>();

        int tmpDistance = Integer.MAX_VALUE;
        for (Integer integer : intArray) {
            int currentNum = (int) integer;
            int currentDistance = Math.abs(currentNum - N);
            if (tmpDistance > currentDistance) {
                tmpDistance = currentDistance;
                outInts.clear();
                outInts.add(currentNum);
            } else if (tmpDistance == currentDistance) {
                outInts.add(currentNum);
            }
        }
        Integer[] array = outInts.toArray(new Integer[0]);
        Arrays.sort(array);
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }
}