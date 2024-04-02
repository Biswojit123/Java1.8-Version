
//Print the element  using forEach(Consumer c)  

import java.util.ArrayList;

public class ForEachMethod {
    public static void main(String [] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(1);
        arr.add(4);
        arr.add(8);
        arr.add(7);
        //useing for loop
        for(int i = 0 ; i < arr.size() ; i ++) {
            System.out.println(arr.get(i));
        }

        System.out.println("======================================");
        //using the forEach loop
        for(Integer i : arr) {
            System.out.println(i);
        }

        System.out.println("========================================");

        //Using the forEach method
        arr.forEach(i->System.out.println(i));
    }
}
