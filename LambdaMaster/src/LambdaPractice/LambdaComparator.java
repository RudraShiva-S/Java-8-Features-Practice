package LambdaPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        // create a list of string
        List<String> names = Arrays.asList("Alice", "Bob", "charlie", "David");

        //lambda used to compare string lengths

        Collections.sort(names, (a, b) -> a.length() -b.length());
        System.out.println(names);
    }
}
