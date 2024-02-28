/*
 * Bipredicate the predefined functional interface.
 * That take the two input and check the condition and return the boolean value.
 * Q:We can take sum value to perfrom arithmetic operation
 */

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String []args) {

       //Here we take the 3 input  
       Integer i1 = 20;
       Integer i2 = 30;
       Integer i3 ;

       BiPredicate<Integer,Integer> bip = (num1,num2) -> num1 > 23 && num2 < 20;

       //Here we check the condition and perfrom the operation. 
       if(bip.test(i1, i2)) {
           i3 = i1 + i2 ;
           System.out.println(i3);
       }else {
            i3 = i1 - i2 ;
            System.out.println(i3);
       }

       //Another Example

       BiPredicate<Integer,String> bipred = (i,s)-> i == s.length() ;


       System.out.println(bipred.test(13,"Biswojit jena"));

    }
}
