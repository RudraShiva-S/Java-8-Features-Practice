package Practice.StreamPractice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Integer {
    public static void main(String[] args) {

        //create a list of integers
        List<Integer> numbers = Arrays.asList(5,12,9,21,5,33,7,9);

        //1. find all even numbers
        List<Integer> EvenNumbers = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        EvenNumbers.forEach(System.out::println);

        //2.Square each numbers
        List<Integer> Square = numbers.stream().map(e -> e * e).collect(Collectors.toList());
        Square.forEach(System.out::println);

        //3.Remove duplicate and sort
        List<Integer> UniqueSorted = numbers.stream().distinct().sorted().collect(Collectors.toList());
        UniqueSorted.forEach(System.out::println);

        //4.Get maximun and minimun
        Integer Maximum = numbers.stream().max(Integer::compareTo).orElse(-1);
        System.out.println(Maximum);

        Integer Minimum = numbers.stream().min(Integer::compareTo).orElse(-1);
        System.out.println(Minimum);

        //5.Sum of all  numbers
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //6.print only the first 3 numbers after sorting
        List<Integer> FirstThree = numbers.stream().sorted().limit(3).collect(Collectors.toList());
        FirstThree.forEach(System.out::println);


    }
}
