import java.util.*;

public class Main {

    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>(
                Map.of("Omega", 24,
                        "Alpha", 1,
                        "Gamma", 3));
        System.out.println(map);
    }
}