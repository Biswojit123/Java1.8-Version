/*
 * Q:Some of two number useing lambada Expression
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;


public class LambadaDemo {
    public static void main(String []args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            //Here we take the two input
            System.out.println("Enter first number :");
            int num1 = Integer.parseInt(br.readLine());

            System.out.println("Enter the Seconde number :");
            int num2 = Integer.parseInt(br.readLine());

            /*
            * Here we use the predefined BiFunction Functional interface to print sum
            * It take the two input and return one output
            */
            BiFunction<Integer,Integer,Integer> bifun = (a,b)->(a+b);

            //BiFunction have a method that take two input that is apply(_,_);
            Integer sum = bifun.apply(num1,num2);

            System.out.println("Sum of two number is :"+sum);


        }
    }
}
