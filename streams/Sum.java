package streams;

import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String[] args) {
        //  Sum all elements of a collection

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumElements(numbers));
    }

    public static Integer sumElements(List<Integer> list) {
        Integer sum;
        return sum = list.stream().reduce(0, (total, number) -> total + number);
    }
}
