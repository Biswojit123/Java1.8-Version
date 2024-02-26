import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {

    //Employee identity
    String name ;
    String location ;
    String dept ;

    //Here we specify the constructer to Initialization of employee
    public Employee(String name ,String location ,String dept) {
        this.name = name ;
        this.location = location ;
        this.dept = dept ;
    }

}



public class PredicateJoining {
    public static void main(String []args) {

        //Here we specify the number of Employee those are working in different location and dept.
        Employee  e1 = new Employee("Biswpjit", "Hyd", "Database");
        Employee  e2 = new Employee("Jagan", "Chen", "Analysis");
        Employee  e3 = new Employee("Ritesh", "Bang", "Developer");
        Employee  e4 = new Employee("Tusar", "Hyd", "Database");
        Employee  e5 = new Employee("Subhransu", "Hyd", "Analysis");

        //Here we add all employee into a list 
        List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5);

        //here we take the two predicate to find the who are wroking in Hyd location and database dept.
        //Predicate one return true if it find the hyd location 
        Predicate<Employee> p1 = employee ->  employee.location.equalsIgnoreCase("Hyd");

        //Predicate two return true if it find the database dept.
        Predicate<Employee> p2 = employee -> employee.dept.equalsIgnoreCase("Database");

        //Here We joining the two predicate 
        Predicate<Employee> p = p1.and(p2);

        //Here we print the those employee who are working in hyd location and database dept.
        for(Employee employee : emp) {
            if(p.test(employee))
            System.out.println(employee.name);
        }
    }
}
