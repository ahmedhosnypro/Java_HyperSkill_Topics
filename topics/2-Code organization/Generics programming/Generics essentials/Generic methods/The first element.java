
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    static <T> T getFirst(T[] t) {
        if (t.length == 0) {
            return null;
        } else {
            return t[0];
        }
    }
}