package chapter1;

public interface SetInterface
{
    public int getCurrentSize();
    public boolean isEmpty();

    /** Adds a new entry to this  set, avoiding duplicates.
     * @param newEntry the object to be added as a new entry.
     * @return true if the addition is successful, or false if the item already exist in the set
     */
    public boolean add(T newEntry);

    /** Removes a specific entry from this set, if possible.
     * @param anEntry  the entry to be removed.
     * @return true if the removal was successful, or false if not.
     */
    public boolean Remove(T anEntry);

    public T remove();
    public void clear();
    public boolean contains (T anEntry);
    public T[] toArray();
}
