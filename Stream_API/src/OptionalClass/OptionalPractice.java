package OptionalClass;

import java.util.Optional;

public class OptionalPractice {

    public static Optional<String>  getName(){
        String name = "Sanjay";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {




        String str = null;

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());   //checks if there is a value is there or not and return rue else false
       // System.out.println(optional.get());  //gets the value that has been stored if no value is there null throws error


        System.out.println(optional.orElse("No value is this object"));


        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse(("null return")));

    }
}
