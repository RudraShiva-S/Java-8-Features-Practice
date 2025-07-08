package Work;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
    public static void main(String[] args) {

        //filter(predicate)
              //boolean value function
        //e -> e >10


        //map(Function)
        /*
        each element operation
         */

        List<String> names = List.of("Sudhir", "Santosh", "Sanjay", "Shruti", "Raju", "Mohan", "Rohan");

        List<String> newNames = names.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers = List.of(23,4,6,2,8,5);
        List<Integer> newnumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newnumbers);

        names.stream().forEach(e-> {
            System.out.println(e);
        });

        newNames.stream().forEach(System.out::println);

        //sorted
        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min "+ integer);

        Integer integer1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max " + integer1);


    }
}
