import java.util.stream.*;

class QuadraticSum {
    public static long rangeQuadraticSum(int fromIncl, int toExcl) {
        return IntStream.rangeClosed(fromIncl, toExcl)
                .reduce(0, (sum, n) -> sum += n * n) - (long) toExcl * toExcl;
    }
}