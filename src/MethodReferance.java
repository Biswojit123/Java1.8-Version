/*
* We can use the method referance in the place of lambad Expression
*/

/**
 * MyInterface
 */
@FunctionalInterface
interface MyInterface {

    public void m1();

}


public class MethodReferance {
    //We have a static method

    public static void m2() {
        System.out.println("Hi i am Biswojit");
    }
    public static void main(String []args) {
        //Here we can call using the Class name directly
        MethodReferance.m2();

        //Here We can call useing lambad Expression 
        MyInterface mi = ()->System.out.println("Hi How are you");
        mi.m1();

        //Here we can call useing the method referance 
        MyInterface me = MethodReferance::m2;
        me.m1();
    }
}