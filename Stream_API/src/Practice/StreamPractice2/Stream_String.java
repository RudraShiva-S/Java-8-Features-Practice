package Practice.StreamPractice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_String {
    public static void main(String[] args) {

        //create a list of arrays
        List<String> names = Arrays.asList("Ravi", "anita", "sachin", "radha", "anita");

        //Convert all names to uppercase
        List<String> Upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
       System.out.println(Upper);

       //2. Remove duplicate names
        List<String> remove = names.stream().distinct().collect(Collectors.toList());
        remove.forEach(System.out::println);


        //3.Get names starting with "r".
        List<String> StartsWith_r = names.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
        StartsWith_r.forEach(System.out::println);

        //4.Sort names alphabetically
        List<String> Alphabetically = names.stream().sorted().collect(Collectors.toList());
        Alphabetically.forEach(System.out::println);

        //5.Count how many names are excatly 5 characters long
        long count = names.stream().filter(e -> e.length() == 5).count();
        System.out.println(count);

        //6. print names one by one with their length
        names.stream().forEach(e -> System.out.println(e + " _ " + e.length()));


    }
}
