package java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEnhancement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // takeWhile(predicate) considers only those elements which stands true against the predicate
        List<Integer> result1 = numbers.stream()
                .takeWhile(n -> n < 6)
                .collect(Collectors.toList());
        System.out.println(result1);//[1,2,3,4,5]

        // dropWhile(predicate) considers only those elements which stands false against the predicate
        List<Integer> result2 = numbers.stream()
                .dropWhile(n -> n < 6)
                .collect(Collectors.toList());
        System.out.println(result2);//[6,7,8,9,10]

        // if collection is null, Stream.ofNullable avoid NullPointerException.
        List<Integer> nullList = null;
        List<Integer> result3 = Stream.ofNullable(nullList)
                .flatMap(nl -> nl.stream())
                .takeWhile(n -> n < 6)
                .collect(Collectors.toList());
        System.out.println(result3); // []

        List<Integer> result4 = Stream.ofNullable(numbers)
                .flatMap(nl -> nl.stream())
                .takeWhile(n -> n < 6)
                .collect(Collectors.toList());
        System.out.println(result4); // [1,2,3,4,5]
    }
}
