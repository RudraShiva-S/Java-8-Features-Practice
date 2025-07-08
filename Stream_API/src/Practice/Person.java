package Practice;

public class Person {
    private String name;
    private int age;

    //creating constructor an callling name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public  String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name + " (" + age + ")";
    }
}
