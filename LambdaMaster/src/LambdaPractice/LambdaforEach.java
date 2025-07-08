package LambdaPractice;

import java.util.Arrays;
import java.util.List;

public class LambdaforEach {
    //print list using forEach and lambda
    public static void main(String[] args) {

        //list of String
        List<String> gods = Arrays.asList("Shiva", "mahadev", "bhrambha" , "vishnu", "Parvati");

        //foreach and lambda to print each element with prefix

        gods.forEach(name -> System.out.println("Gods: " + name));
    }
}
