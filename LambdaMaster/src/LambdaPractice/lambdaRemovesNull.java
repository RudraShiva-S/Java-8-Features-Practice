package LambdaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaRemovesNull {
    public static void main(String[] args) {
        //make a list with some null and empty elements
        List<String> data = Arrays.asList("shiva", "", "rudra", null, "Vishnu", "kali", null, "" , "ganesh");

        //Remove nulls and empty strings using lambda  + filter

        List<String> cleaned = data.stream().filter(
                s -> s!= null && !s.trim().isEmpty()).collect(Collectors.toList());


        //print cleaned list
        System.out.println(cleaned);
    }
}
