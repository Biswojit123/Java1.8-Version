/*
 * BiConsume is the predefined Functional interface .
 * That can take the two input value and that don't return any things.
 */




import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main (String []args) {
        
        //Here BiConsume interface take the integre and string value.
        BiConsumer<Integer,String> bicon = 
        (id,name) -> System.out.println("Student name:"+name+"Student id is :"+id);

        //Useing its predefined method accept to provide the value that are showing given below
        bicon.accept(3456, "Jagan palei");
        bicon.accept(5678, "Biswojit jena");
        bicon.accept(7890, "Jiten jena");
    }
}
