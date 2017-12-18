package streams;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class KidsNames {

    public static void main(String[] args) {

        //Get names of all kids (under age of 18)

        List<Kid> kids = new ArrayList<>();
        Kid kid1 = new Kid("Romek", 17);
        Kid kid2 = new Kid("Tolek", 32);
        Kid kid3 = new Kid("Franek", 4);
        Kid kid4 = new Kid("Pola", 12);
        Kid kid5 = new Kid("Max", 19);

        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
        kids.add(kid4);
        kids.add(kid5);

        System.out.println("Kids names, who ae under 18 :" + Kid.getNamesOfKids(kids));

    }

    public static class Kid {

        private String name;
        private int age;

        public Kid(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public static List<String> getNamesOfKids(List<Kid> list) {
            return list.stream().
                    filter(person -> person.getAge() < 18).
                    map(kid -> kid.name).collect(toList());
        }

    }
}
