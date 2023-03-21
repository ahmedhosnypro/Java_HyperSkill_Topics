import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    static <T> boolean hasNull(T[] array) {
        boolean isNull = false;
        for (var v : array) {
            if (v == null) {
                isNull = true;
                break;
            }
        }
        return isNull;
    }
}