package LambdaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdUpperCase {
    public static void main(String[] args) {
        //LIst of lower case names
        List<String> names = Arrays.asList("Raju", "kiran", "ravi","mohan","sumit");

        //convert each string to uppercase using lambda expression

        List<String> upper = names.stream().map(String::toUpperCase)    //mehtod reference (lambda shorhand)
                .collect(Collectors.toList());

        upper.forEach(System.out::println);  //print each name in uppercase

    }
}
