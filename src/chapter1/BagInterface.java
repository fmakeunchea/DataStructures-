package chapter1;

//An interface that describe the operations of a bag of object
public interface BagInterface<T> {

    /**Gets the current number of entry in this bag
     * @return the integer number of entry curently in the bag
     */
    public int getCurrentSise();
    /** sees wheter this bag is empty.
     * @return True if the bag is empty , or false if the bad is not empty
     */
    public boolean isEmpty();
    /** Adds a new entry to this bag
     * @param newEntry the object to be added as a new entry
     * @return True if the addition is successful or false if not
     */
    public boolean Add(T newEntry);
    /**Remove one unspecified entry from this bag if possible.
     * @return Either the removed entry, if the removal was successful or null
     */
    public T remove();
    /** Remove one occurence of a given entry from this bag if possible.
     * @param anEntry the entry to be counted
     * @return the number of time anEntry appear in the bag
     */
    public int getFrequencyOf(T anEntry);
    /** Test whether this bag contains a given entry
     * @param anEntry  the entry to find.
     * @return True if the bag contain anEntry, or false if not
     */
    public boolean contains(T anEntry);
    /** retrieve all entry that are in the bag
     * @return a newly allocated array of all the entry in the bag
     * Note if the bag is empty, the return array is empty
     */
    public T[] toArray();
}
