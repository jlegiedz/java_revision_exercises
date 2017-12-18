package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OldestPerson {

    // Get oldest person from the collection
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Asia", 15);
        Person person2 = new Person("Rafek", 17);
        Person person3 = new Person("Ola", 54);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(Person.findTheOldest(personList));

        System.out.println(Person.findTheOldest2(personList));

    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static Person findTheOldest(List<Person> list) {
            Person oldestPerson = list.stream().max(Comparator.comparing(person -> person.age)).get();
            return oldestPerson;
        }

        public static Person findTheOldest2(List<Person> list) {
            Person oldestPerson = list.stream().max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).get();
            return oldestPerson;
        }
    }
}
