package Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

//Stream API - Collection Process
        //Collection / group of objects (Arrays)

        //1 Blank Stream
        Stream<Object> emptyStream = Stream.empty();

        //2 - array, object, collection
        String names[] = {"Sanjay","Divya","Rahul","Puja","preeti"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e-> {
            System.out.println(e);
        });

        //3
        Stream<Object> streamBuilder = Stream.builder().build();


        //4
        IntStream stream = Arrays.stream(new int[]{2, 4, 5, 65, 3, 345});
        stream.forEach(e->{
            System.out.println(e);
        });

        //or also can do this for printing
        //stream.forEach(System.out::println);

        //5- List, set
        List<Integer> list2 = new ArrayList<>();
        list2.add(67);
        list2.add(42);
        list2.add(12);
        list2.add(4);
        list2.add(25);

        Stream<Integer> stream2 = list2.stream();
        //stream2.forEach(System.out::println);
        //also
        stream2.forEach(e->{
            System.out.println(e);
        });

    }
}
