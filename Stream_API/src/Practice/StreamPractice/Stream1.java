package Practice.StreamPractice;

import Practice.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {

        //creating a list in class person
        List<Person> people = Arrays.asList(
                new Person("Ram",34),
                new Person("shyam", 39),
                new Person("Geeta", 22),
                new Person("Sita",45),
                new Person("Mohan",19),
                new Person("Radha", 35)
        );

        //1.filter : Get people older than 25
        List<Person> collectPeople = people.stream().filter(person -> person.getAge() > 25).collect(Collectors.toList());
        System.out.println("People older than 25: ");
        collectPeople.forEach(System.out::println);

        //2.map: get names in uppercase
        List<String> UppercaseNames = people.stream().map(person -> person.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println("Names in uppercase: ");
        UppercaseNames.forEach(System.out::println);

        //3.sorted: sort by age ascending
        List<Person> SortedByAge = people.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        System.out.println("Sorted by age: ");
        SortedByAge.forEach(System.out::println);

        //4.min and max: find yougest and oldest
        Optional<Person> yougest = people.stream().min(Comparator.comparingInt(Person::getAge));
        Optional<Person> oldest = people.stream().max(Comparator.comparingInt(Person::getAge));

        System.out.println("Youngest person: " + yougest.orElse(null));
        System.out.println("Oldest person: " + oldest.orElse(null));

        //5.forEach: print all names
        System.out.println("All Names: ");
        people.stream().map(Person::getName).forEach(System.out::println);

        //6.collect: create a set of names
        Set<String> nameset = people.stream().map(Person::getName).collect(Collectors.toSet());
        System.out.println("Names in a set(No Duplicates): " + nameset);

    }
}
