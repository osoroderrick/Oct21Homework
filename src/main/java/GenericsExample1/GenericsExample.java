package GenericsExample1;

import GenericsExample1.Animal;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();

        Printer<Dog> doublePrinter = new Printer<>(new Dog());
        doublePrinter.print();

        shout("John",74);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printListAnimal(catList);

    }

    private static <T,V> T shout(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!!!!");
        System.out.println(otherThingToShout + "!!!!!");

        return thingToShout;
    }

    private static void printList(List<?> myList){
        System.out.println(myList);
    }
    private static void printListAnimal(List<? extends Animal> myList){
        System.out.println(myList);
    }
}
