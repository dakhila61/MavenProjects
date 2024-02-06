package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthGrouper {

    public static Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
