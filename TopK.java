/**
   Interface that defines the public API of the "TopK" data
   structure that keeps only the "best" values added according to a
   given Comparator.

   Based on Bailey's Java Structures Chapter 11 Lab.

   @author Jim Teresco
   @version Spring 2021
*/

public interface TopK<E> extends Iterable<E> {

    /**
       Add a new element to the TopK.
       
       @param item the element to add
    */
    public void add(E item);

    /**
       Return the number of elements currently stored in the structure.
       Note that this would never be larger than the "K" value that
       will be specified to the constructor of an implementing class.

       @return the number of elements currently stored in the structure
    */
    public int size();

    /**
       Clear the contents of the structure.
    */
    public void clear();

}
