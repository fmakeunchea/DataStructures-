package chapter1;

public class ArrayBag<T> implements BagInterface<T> {
    private final T[] bag ;
    private int numberOfEntries ;
    private static final int DEFAULT_CAPACITY = 25 ;

    public ArrayBag(){


    }

    public ArrayBag(int desiredCapacity){




    }


    @java.lang.Override
    public int getCurrentSise() {
        return 0;
    }

    @java.lang.Override
    public boolean isEmpty() {
        return false;
    }

    @java.lang.Override
    public boolean Add(T newEntry) {
        return false;
    }

    @java.lang.Override
    public T remove() {
        return null;
    }

    @java.lang.Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @java.lang.Override
    public boolean contains(T anEntry) {
        return false;
    }

    @java.lang.Override
    public T[] toArray() {
        return null;
    }
}
