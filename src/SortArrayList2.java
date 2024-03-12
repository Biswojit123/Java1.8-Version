
//Approach-2 using lambada expression 

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList2 {
    public static void main(String [] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(7);
        arr.add(9);
        arr.add(6);

        System.out.println("Before the Sort ::"+arr);

        Collections.sort(arr, (i,j)->-i.compareTo(j));//Use the lambad Expression.

        System.out.println("After the Sort ::"+arr);
    }
}
