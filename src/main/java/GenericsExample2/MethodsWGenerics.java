package GenericsExample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsWGenerics {
    public static void main(String[] args) {
        List<String> originalList = List.of("Hello", "World");

        System.out.println(reverse(originalList));
        System.out.println(originalList);

        List<Integer> anotherList = List.of(1,2,3,4,5);
        List<Integer> reversed = reverse(anotherList);

        System.out.println("Reversed:" + reversed);
        System.out.println("Original:" + anotherList);
    }

    private static <T> List<T> reverse(List<T> originalList){
        List<T> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        return reversedList;
    }
}
