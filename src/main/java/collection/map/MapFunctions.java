package collection.map;

import java.util.*;


class MapFunctions {

    public static void removeLongNames(Map<String, String> map) {
        // write your code here
        map.entrySet().removeIf(entry -> entry.getKey().length() > 2 || entry.getValue().length() > 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        System.out.println(map.size());

        MapFunctions.removeLongNames(map);

        System.out.println(map.size());
    }
}