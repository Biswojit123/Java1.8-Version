import java.util.function.Supplier;

//Supplier interface is the predefine Functional interface that only use for return the value with out taking output.
public class SupplierDemo {
    public static void main(String []args) {

        //Here we use the supplier interface
        //it only return the value don't take the any input
        Supplier<String> sup = () -> {
            String otp = " ";
            for(int i = 0 ; i < 5 ; i ++ ) {
                otp = otp + (int) (Math.random() * 10);
            }  
            return otp;
        };

        //We are generated the random otp 
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        
    }
}
