package Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        //Q>Create a List  and filter all even numbers from list

   //First way to create List
        List<Integer> list1 = List.of(2, 4, 45, 56, 43, 67, 58, 34, 53, 43, 43);

//Second way to creat List
        List<Integer> list2 = new ArrayList<>();
        list2.add(67);
        list2.add(42);
        list2.add(12);
        list2.add(4);
        list2.add(24);


        //Third way to create List
        List<Integer> lidt3 = Arrays.asList(23,54,34,67,87,88);


        //List1
        //Without StreamAPI
        List<Integer> listEven = new ArrayList<>();

        for (Integer i : list1){
            if (i%2==0){
                listEven.add(i);
            }
        }
//        System.out.println(list1);
//        System.out.println(listEven);

        //Using Stream API
        Stream<Integer> stream = list1.stream();
        List<Integer> newlist = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);

        //otherways
        List<Integer> newlist1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);

        List<Integer> newlist2 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newlist1);
    }
}
