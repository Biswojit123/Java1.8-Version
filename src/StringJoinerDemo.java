/*
 * String joiner are used to joining strings a delimeter or a serfix and prefix.
 * We don't require to use the "" double quation and concat.
 */

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String []args) {

        //Using delimiter
        StringJoiner str1 = new StringJoiner(" ");

        str1.add("Biswo");
        str1.add("it");
        str1.add("java");

        System.out.println(str1);

        //using the prefix and sufix
        StringJoiner str2 = new StringJoiner(" ","(",")");

        str2.add("Biswo");
        str2.add("it");
        str2.add("java");

        System.out.println(str2);

    }
}
