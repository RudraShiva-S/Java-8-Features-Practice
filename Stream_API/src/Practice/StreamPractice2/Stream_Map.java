package Practice.StreamPractice2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_Map {
    public static void main(String[] args) {

        //create a map in a key _ value structure
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ravi",85);
        scores.put("Anita",92);
        scores.put("Sachin",78);
        scores.put("Radha",90);
        scores.put("Vikram",66);

        //1. Filter students who scored more than 80
//        scores.entrySet().stream()
//                .filter(entry -> entry.getValue()>80)
//                .forEach(entry -> System.out.println(entry.getKey()+ " _ "+ entry.getValue()));  //custom format for key "_" value print

        //2.get names of the students who passed (score >= 70
        scores.entrySet().stream()
                .filter(entry -> entry.getValue()>= 70).forEach(System.out::println);  // gets defaults output

        //same thing diffrent approch
        List<String> Passed = scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 70)
                .map(Map.Entry::getKey).collect(Collectors.toList());     // extract just the name (key) from each entr
        Passed.forEach(System.out::println); // takes the passed keys from result and prints only key values (names)

        //3. Find the top scorer
        Map.Entry<String, Integer> TopScorer = scores.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        System.out.println("Top Scorer of the Academy: " + TopScorer);

    }
}
