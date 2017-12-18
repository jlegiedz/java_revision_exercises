package streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class Multidimensional {
    public static void main(String[] args) {

        //Flatten multidimensional collection
        List<List<String>> collection =
                Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));

        System.out.println(flatenList(collection));

    }

    private static List<String> flatenList(List<List<String>> collection) {
        return collection.stream().flatMap(list -> list.stream()).collect(toList());
    }




}


