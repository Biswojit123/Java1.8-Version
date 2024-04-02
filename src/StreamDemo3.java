import java.util.stream.Stream;

public class StreamDemo3 {

    public static void main(String []args) {
        User us1 = new User("Biswojit jena", 22);
        User us2 = new User("Rasmita jena", 20);
        User us3 = new User("Jagan palei", 18);
        User us4 = new User("Dipti jena", 17);
        User us5 = new User("Ritesh nayak", 16);
        User us6 = new User("Bachan palei", 22);
        User us7 = new User("Ashoka behera", 12);

        Stream.of(us1,us2,us3,us4,us5,us6,us7).filter(name2 ->name2.age >= 18).forEach(name1->System.out.println(name1.name));
    }
}
class User{
    String name ;
    int age ;

    User(String name,int age) {
        this.name = name ;
        this.age = age ;
    }
}