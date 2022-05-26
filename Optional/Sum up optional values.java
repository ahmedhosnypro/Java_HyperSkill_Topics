import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        var optList = provider.getValues();
        AtomicInteger sum = new AtomicInteger();
        for (var opt : optList) {
            opt.ifPresent(sum::addAndGet);
        }
        System.out.println(sum);
    }
}

class ValueProvider {
    private List<Optional<Integer>> opts; // cache to provide reproducing method invocation

    public List<Optional<Integer>> getValues() {
        if (opts != null) {
            return opts;
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        opts = java.util.stream.IntStream
                .rangeClosed(1, number)
                .mapToObj(n -> {
                    String val = scanner.next();
                    return "null".equals(val) ?
                            Optional.<Integer>empty() :
                            Optional.of(Integer.valueOf(val));
                })
                .collect(java.util.stream.Collectors.toList());

        return opts;
    }
}