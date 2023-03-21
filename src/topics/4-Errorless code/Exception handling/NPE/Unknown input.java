import java.util.Objects;

class Util {
    public static void printLength(String name) {
        if (Objects.nonNull(name)) {
            System.out.println(name.length());
        }
    }
}