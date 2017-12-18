package streams;

//Filter collection so that only elements with less than 4 characters are returned.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

    public static void main(String[] args) {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");

        lessThanFour(collection);
    }

    private static void lessThanFour(List<String> collection) {
        List<String> list = collection.stream().filter(c -> c.length() < 4).collect(Collectors.toList());
        System.out.println(list);
    }
}
