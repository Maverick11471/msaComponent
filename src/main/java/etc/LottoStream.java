package etc;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoStream {

    public static void main(String[] args) {
        IntStream.range(0, 5).mapToObj(i -> new Random().ints(1, 46)
            .distinct()
            .limit(6)
            .sorted()
            .boxed()
            .collect(Collectors.toList()))
            .forEach(System.out::println);

    }
}
