package GenericsExample2;

public class Pairs <T extends Comparable>{
    private final T first;
    private final T second;


    public Pairs(T first, T second) {
        this.first = first;
        this.second = second;

    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getLargest(){
        if(first.compareTo(second) > 0) {
            return first;
        }
        return second;
    }



    @Override
    public String toString() {
        return "Pair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
