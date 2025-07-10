package OptionalClass;

import java.util.Optional;

//7.Practice task : use Optioal t o Avoid NUll Cheacks
//task8
public class OptionalPractice3 {

    String name;
    public  OptionalPractice3(String name){
        this.name = name;
    }
    public Optional<String> getNameOptional(){
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
      OptionalPractice3 optionalPractice3 = new OptionalPractice3(null);

        // Safe way to access name without null check
        String result = optionalPractice3.getNameOptional().orElse("Default Name");
        System.out.println("Name is: " + result);

    }
}
