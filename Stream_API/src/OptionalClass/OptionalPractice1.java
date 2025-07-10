package OptionalClass;

import java.util.Optional;

public class OptionalPractice1 {
    public static void main(String[] args) {

        //1. Basic Optional Creatioon And Usage

        String name = "Rudra";
        int integer  = 50;

        Optional<String> optioanlName = Optional.of(name); // not null
        System.out.println(optioanlName.get());  // prints rudra

        Optional<Object> empty = Optional.empty();  //for empty value
        System.out.println(empty.isPresent());  //return false

      //Task for Practice
        Optional<Integer> FirstInteger = Optional.of(integer);
        System.out.println(FirstInteger.isPresent());
        System.out.println(FirstInteger.get());



    }
}
