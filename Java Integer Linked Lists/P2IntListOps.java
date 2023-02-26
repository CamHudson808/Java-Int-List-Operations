// CS 201 Project 2 Problem 1
// Name: Cameron Hudson

public class P2IntListOps extends IntListOps {

    // Tackle one at a time! Test using
    // "java P2IntListOpsTest"

    public static boolean isSorted(IntList L) {

        if (isEmpty(L)) {
            return true;
        }

         else if (length(L) == 1){
        
        return true;
         }
        else if (L.head > L.tail.head) {
            return false;
        }
    else {

        return isSorted(L.tail);

    }
}

    public static IntList remove(int i, IntList L) {


        if (isEmpty(L) == true) {
            return empty();
        }

        else if (L.head != i) {


            return prepend(L.head, remove(i, L.tail));
        }
         
        return remove(i , L.tail);    
          
    }

    public static IntList removeDuplicates(IntList L) { 

        if (isEmpty(L) == true) {
            return empty();
        }   

        else if (length(L) == 1) {
            
        return L;
    }

        return prepend(L.head, removeDuplicates(remove(L.head, L.tail)));   

    }

}

