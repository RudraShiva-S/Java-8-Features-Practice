package LambdaPractice;

import java.util.Arrays;
import java.util.List;

public class LambdaMax {
    //find the maximum element is a list using lambda
    public static void main(String[] args) {
        //list of INtegers
        List<Integer> numbers = Arrays.asList(2,45,76,45,34,23);

        //use stream and lambda to find max
        int max = numbers.stream().max(Integer:: compare)  //lambda to compare integers
                .orElse(-1);

        //default value if list is empty
        System.out.println("Max: " + max);

    }
}
