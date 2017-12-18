package streams;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class TryStreams {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 3, 2, 6, 5);
        List<Integer> evenNumbers =
                list.stream().filter(
                        n -> {
                            return n % 2 == 0;
                        }
                ).collect(toList());


        List<Integer> list_2 = Arrays.asList(8, 4, 3, 2, 5, 0, 9);
        List<Integer> sortedEven =
                list_2.stream().filter(
                        n -> {
                            return n % 2 == 0;
                        }
                ).sorted(Comparator.reverseOrder())
                        .collect(toList());

        System.out.println(evenNumbers);
        System.out.println(sortedEven);


        List<String> names = Arrays.asList("Asia", "Rafal", "Kasia", "Asia");

        Optional<String> opt = names.stream().filter(t -> t == "Franek").findFirst();
        System.out.println(opt);

    }


}
