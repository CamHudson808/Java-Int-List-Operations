// CS 201 Project 2 Problem 2
// Name: Cameron Hudson

public class P2IntListListOps extends IntListListOps {

    // Tackle one at a time! Test using
    // "java P2IntListOpsTest"

    public static IntListList filterSorted (IntListList L) {
        // Returns a list of all of the lists of L that are sorted. 
        // To use a method from P2IntListOps.java, use the prefix
        // "P2IntListOps."

        if (isEmpty(L) == true) {
            return empty();
        }

        else if (P2IntListOps.isSorted(L.head) == true) {
            return IntListList.prepend(L.head, filterSorted(L.tail));
        }

        return filterSorted(L.tail);

        }
 // just a placeholder
    

    public static IntListList mapPrepend (int i, IntListList L) {
        // Returns a new list that contains list elements in which i is
        // prepended to every corresponding element of the input list.
        // Note that this method uses both IntList and IntListList
        // methods. In the body, IntList methods must contain an explicit
        // "IntList." prefix, but no prefix is necessary for IntListList
        // methods.

        if (isEmpty(L) == true) {

            return empty();

        }

        return IntListList.prepend(IntList.prepend(i, L.head), mapPrepend(i, L.tail));

    }

    public static IntListList subsequences (IntList L) {
        // Given an integer list L, return a list of all the subsequences
        // of L.  Think carefully about the base case!  Note that this
        // method uses both IntList and IntListList methods. In the body,
        // IntList methods must contain an explicit "IntList." prefix, but
        // no prefix is necessary for IntListList methods.
        if (L == null) {
            return prepend(IntList.empty(), IntListList.empty());
        }
        
        else {

            return append(subsequences(L.tail), mapPrepend(L.head, subsequences(L.tail)));

        }
          // just a placeholder
    } 

    // Optional (extra credit):
    // Please don't remove this method even if you don't tackle it so our test code runs

    public static IntListList longest (IntListList L) {

        if (L == null) {
            return prepend(IntList.empty(), IntListList.empty());

        }

        else {
            return empty();
        }

        // Returns a list of all of the lists of L that have the longest length. 
        // If L is empty, returns the empty list. 
        // Think carefully about base cases here!

     // just a placeholder
    }
}
