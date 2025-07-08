package LambdaPractice;

import java.util.Arrays;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        //Create a list of Strings
        List<String> names = Arrays.asList("Shiva", "Raju","Pritam", "Sudhir", "Kailash");

        //Sort the list using Lambda expression: compares strings by their length
        names.sort((a,b) -> Integer.compare(a.length(),b.length()));

        //print each name after sorting
        names.forEach(System.out::println);

    }
}
