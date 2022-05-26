import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        var ret = new ArrayList<>(List.copyOf(numbers));
        ret.sort((n1, n2) -> {
            if (n1 % 2 != 0 && n2 % 2 != 0) {
                return n1.compareTo(n2);
            } else if (n1 % 2 == 0 && n2 % 2 == 0) {
                return n2.compareTo(n1);
            } else if (n1 % 2 != 0) {
                return -1;
            } else {
                return 1;
            }
        });
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(
                List.of(new Integer[]{0, 1, 2, 3, 4, 5}));

        System.out.println(sortOddEven(nums));
    }
}