package LambdaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterEven {
    public static void main(String[] args) {
        //Create a list of Integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,7,8,4,6,9);

        //Stream the list and filter  only even numbers using lambda Expressions
        List<Integer> even = numbers.stream().filter(n ->  n % 2 ==0)  //lambda filter even numbers
                .collect(Collectors.toList());
        System.out.println(even);  //print the filtered list
    }
}
