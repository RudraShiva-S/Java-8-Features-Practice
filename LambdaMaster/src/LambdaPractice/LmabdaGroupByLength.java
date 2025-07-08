package LambdaPractice;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group Strings by their lengths
public class LmabdaGroupByLength {

    public static void main(String[] args) {

        //List of String
        List<String> words = Arrays.asList("Rudra", "Kali", "Om", "PAnkaj","Sanjay");

        //Group by length using Collectors.groupBy and lambda
        Map<Integer, List<String>> grouped = words.stream().collect(Collectors.groupingBy(String::length));

        //print the map
        System.out.println(grouped);

    }
}
