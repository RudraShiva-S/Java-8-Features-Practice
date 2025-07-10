package OptionalClass;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalPractice2 {
    public static void main(String[] args) {

        //2.practice .of, .ofNullable(), empty() Differences
        String name = null;  //task1
        String names = "Sanjay"; //task2


        //Optional.of(null);  // throws NUllPointerException
        //task1
        Optional<String> safe = Optional.ofNullable(name);  //safe
        System.out.println(safe.orElse("Default Name"));

        //Task 2 Create Two Optional
        Optional<String> string1 = Optional.of(names);
        System.out.println(string1.get());

        Optional<String> stringnull = Optional.ofNullable(names);
        System.out.println(stringnull.orElse("null value"));


        //Optional Practice for + ifPresent
        //task3

        Optional<String> email = Optional.of("shiva@gmail.com");
        email.ifPresent(e -> System.out.println("Sending email to " + e));


        //4. Using orElse() vs orElseGet()
        //Task5
        String nameOne = Optional.ofNullable(name).orElse("Default");
        String nameTwo = Optional.ofNullable(name).orElseGet(() -> "Generated Default");

        System.out.println(nameOne);  //default
        System.out.println(nameTwo);   //Generated Default

        //5.Optional +map() and flatMap()
        //task6
        Optional<String> MyName = Optional.of("Shiva");
        Optional<String> upper = MyName.map(String::toUpperCase);
        System.out.println(upper.get());  //SHIVA

        //6.Optional + filter(0
        //task7
        Optional<String> rudra = Optional.of("Rudra");
        rudra.filter(e -> e.startsWith("R")).ifPresent(e -> System.out.println("Starts with R: " + e));




    }
}
