import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String [] args) {
        //Suppose we have the set of number
        List<Integer> list = Arrays.asList(66,22,33,78,12,13,14);

        //Approach-1
        for(Integer i: list) {
            if(i > 20) {
                System.out.println(i);
            }
        }
        System.out.println("==========================================");
        //Approach-2 Using Stream
        Stream<Integer> str = list.stream();
        //Now Filter the Stream and return a stream
        Stream<Integer> str1 = str.filter(i -> i >20);
        //Print the Filter stream
        str1.forEach(i->System.out.println(i));
        System.out.println("==========================================");

        //Approach-3
        //In Single line
        list.stream().filter(i-> i > 20).forEach(i->System.out.println(i));
    }
}
