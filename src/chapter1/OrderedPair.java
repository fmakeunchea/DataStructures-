package chapter1;

public class OrderedPair<T> implements Pairable<T>
{
    private T first, second;

    public OrderedPair(T firstItem, T secondItem)
    {
        first = firstItem;
        second = secondItem;
    }//end constructor

    /** Return the first object in this pair*/
    public T getFirst()
    {
        return first;
    }
    /** Return the second object in this pair*/
    public T getSecond()
    {
        return second;
    }
    /** Return the string representation of this pair*/
    public String toString()
    {
        return "(" + first + "," + second + ")";
    }
    /** Interchanges the objects object in this pair*/
    public void changeOder()
    {
        T temp = first;
        first = second;
        second = temp;
    }
}
