
//Approach-1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {
    public static void main(String []args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(7);
        arr.add(9);
        arr.add(6);

        System.out.println("Before the Sort ::"+arr);

        Collections.sort(arr, new ComparatorDemo());

        System.out.println("After the Sort ::"+arr);
    }
}

class ComparatorDemo implements Comparator<Integer> {
    
    public int compare(Integer i1,Integer i2) {
        return -i1.compareTo(i2);
    }
}
