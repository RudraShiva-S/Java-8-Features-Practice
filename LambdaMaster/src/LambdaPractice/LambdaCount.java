package LambdaPractice;

import java.util.Arrays;
import java.util.List;

public class LambdaCount {
    public static void main(String[] args) {

        //list of strings
        List<String> items = Arrays.asList("kailash","rudra", "purosatam", "raajveer", "sudhirNayak");

        //filter the list to get the string length > 5
       long count =  items.stream().filter(s -> s.length() >5).count();

       //print count
        System.out.println("Count:" + count);

    }
}
