/*
 * Function is the predefined Functional interface .
 * that have the one method that is apply(), it take the input return the output
 * its work is the take the input and the retun output.
 * 
 * Ex:We provide the number of names that to find the length of that all no of names.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String []args) {
        
        //Here we take the Function interface that take the string and return the integer
        Function<String ,Integer> fun = name -> name.length();


        //Here we take a list that store the no. of Names that to be provided to the Function interface.
        List<String> lis = Arrays.asList("Jagan","Biswojit","Pinkun","Ajit","Gautam");

        for(String str : lis) {
            System.out.println(fun.apply(str));
        }
    }
}
