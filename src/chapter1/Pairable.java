package chapter1;

public interface Pairable<T>
{
    public T getFirst();
    public T getSecond();
    public void changeOrder();
}
