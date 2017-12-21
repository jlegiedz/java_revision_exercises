package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Statistics {

    public static void main(String[] args) {

        //Get people statistics: average age, maximum age, minimum age and sum og all ages.

        List<People> people = new ArrayList<>();
        People one = new People("Olek", 33);
        People two = new People("Karol", 54);
        People three = new People("Witek", 12);
        People four = new People("Jerzy", 63);
        People five = new People("Kasia", 7);
        People six = new People("Maja", 28);

        people.add(one);
        people.add(two);
        people.add(three);
        people.add(four);
        people.add(five);
        people.add(six);

        System.out.println("The age average of people is: " + People.getAverageAge(people));

        System.out.println("The oldest person is " + People.getMaxAge(people));
        System.out.println("Max age is: " + People.getMaxAge(people));

    }

    public static class People {
        private String name;
        private int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name +
                    ", at the age of :" + age;
        }

        public static double getAverageAge(List<People> list) {
            return list.stream().collect(Collectors.averagingInt(p -> p.age));
        }

        public static People getTheOldest(List<People> list) {
            People oldeest = list.stream().max(Comparator.comparing(p -> p.getAge())).get();
            return oldeest;
        }

        public static int getMaxAge(List<People> list) {
            int maxAge = list.stream().max(Comparator.comparing(p -> p.getAge())).get().getAge();
            return maxAge;
        }
    }

}
