package GenericsExample2;

public class Bounding {

    public static void main(String[] args) {
        Pairs<Integer> firstPair = new Pairs<>(42,500);
        Pairs<Integer> secondPair = new Pairs<>(500,42);

        System.out.println(firstPair.getLargest());
        System.out.println(secondPair.getLargest());
    }
}
