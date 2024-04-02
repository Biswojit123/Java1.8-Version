import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String []args) {
        //Suppose we have the Set of Names to find the names Whose first char. is 'A'

        List<String> names = Arrays.asList("Ajit","Abhishek","Naresh","Ritesh","Subhransu","Ashok","Arati","Amina");

        //Write the logic to find the names whose first char. start with 'A'
        names.stream().filter(name->name.startsWith("A")).forEach(str->System.out.println(str));
    }
}
