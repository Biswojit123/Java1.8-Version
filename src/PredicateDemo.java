//Q:Find the person whose age is gater than the 18.

//We have one persion class

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
    //Person have identity
    int age ;
    String name ;

    //person constructer to initialize the person
    public Person(int age , String name) {
        this.name = name ;
        this.age = age ;
    }
}


public class PredicateDemo {
    public static void main(String[] args) throws Exception {

        //We have the four Person to find out which person age is gater than the 18
        Person p1 = new Person(12, "Biswojit");
        Person p2 = new Person(23,"jagan");
        Person p3 = new Person(22,"Gautam");
        Person p4 = new Person(34,"Soloni");

        //Here we add all person into a list
        List<Person> person = Arrays.asList(p1,p2,p3,p4);

        //Here we use the Predicate Functional interface to return the true or false if condition satisfide
        //Here use lambad Expression
        Predicate<Person> p = personr -> personr.age > 18 ;

        //Here we use the for each loop to print whose age is gater than 18
        for(Person personr : person) {
            if(p.test(personr))
            System.out.println(personr.name);
        }

    }
}
