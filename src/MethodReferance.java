/*
* We can use the StaticMethod referance in the place of lambad Expression
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

        //Here We can call using lambad Expression 
        MyInterface mi = ()->System.out.println("Hi How are you");
        mi.m1();

        //Here we can call useing the method referance i.e static method referance .
        //Because we provided the referance of m2 to m1 using Present  
        MyInterface me = MethodReferance::m2;
        me.m1();
    }
}