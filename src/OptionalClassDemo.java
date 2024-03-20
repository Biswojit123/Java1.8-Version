
/*
 * Optional class implematation
 * 
 */

import java.util.Optional;
import java.util.Scanner;

class User {
    public String getUserNameById(int userId) {
        if(userId == 100) 
            return "Jhon";
        else if(userId == 101)
            return "Hyper";
        else if(userId == 102) 
            return "Miller" ;
        else 
            return null ;
    }
    public Optional<String> getUserNameByid1(int userId) {
        String name = null;
        if(userId == 101  ) {
            name = "Raju";
        }else if(userId == 102) {
            name = "Ramabati";
        }else if(userId == 103) {
            name = "Rakesh";
        }else if(userId == 100) {
            name = "Ranu";
        }
        return Optional.ofNullable(name);
        
    }
}

public class OptionalClassDemo {
    public static void main (String []args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Untill we don't give 0 that not stop");
            int choice = sc.nextInt();
            while (choice != 0) {
                System.out.println("Enter the UserId :");
                int userId = sc.nextInt();

                User u = new User();

                Optional<String> userName = u.getUserNameByid1(userId);

                if(userName.isPresent()) {
                    String name = userName.get();
                    String message = name.toUpperCase()+",Hello"; 
                    System.out.println(message);
                }else {
                    System.out.println("UserId is not matched in user class id!!");
                }

                //Here we chek the null 
                //if we don't use the null checking then 
                // if(userName != null) {
                //     String message = userName.toUpperCase()+", Hello";
                //     System.out.println(message);
                // }else {
                //     System.out.println("Enter userId does not match!!");
                // }
                //Using optional class

                System.out.print("Untill we don't give 0 that not stop :");
                choice = sc.nextInt();
            }
        }
    }
}
