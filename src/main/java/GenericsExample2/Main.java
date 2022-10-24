package GenericsExample2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");

        String hello = strings.get(0);
        String world = strings.get(1);

        System.out.println(hello + " " + world);

        Pair<String,String> strings1 = new Pair<>("Hello", "World");
        Pair<Integer, Integer> integers = new Pair<>(42,500);

        System.out.println(strings);
        System.out.println(integers);


        Pair<Person, Person> people = new Pair<>(new Person("Richard"), new Person("Casey"));

        System.out.println(people);

        Pair<String, Integer> stringIntegerPair = new Pair<>("Hello", 42);
        String first = stringIntegerPair.getFirst();
        Integer second = stringIntegerPair.getSecond();
    }
}
