import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String []args) {
        
        //Here we take the input
        Consumer<String> con = name -> System.out.println(name+", Hello");

        //Here we provide the value for the lambda expression that not return anythings
        con.accept("Ashoka");
        con.accept("Aloka");
        con.accept("Anil");

        //Here we provide the integer value then
        //forEach() used the Consumer interface

        List<Integer> l = Arrays.asList(10,20,30,40,50);
        //We have to print the above list element we use the 
        //foreach loop
        //for loop
        //Iterator
        //ListIterator
        //But now we are use the forEach() method that accept the consumer functional interface to print
        //Consumer interface take the input but not return anythings
        l.forEach(i -> System.out.print(i+"\t"));
        //This above concept is the advantage 


    }
}
