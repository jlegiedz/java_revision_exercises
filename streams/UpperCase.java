package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert elements of a collection to upper case.

public class UpperCase {

    public static void main(String[] args) {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");

        toUpperCase(collection);
    }

    private static void toUpperCase(List<String> collection) {
        List<String> collectionToUpper = collection.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
        System.out.println(collectionToUpper);
    }


}
