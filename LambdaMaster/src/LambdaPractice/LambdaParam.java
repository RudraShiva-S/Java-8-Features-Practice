package LambdaPractice;

//lambda as Method Parameter
interface Greeting{
    void say(String name);
}

public class LambdaParam {
 //accepts a lambda and excutes it
    public static void greet(Greeting greeting) {
        greeting.say("Sanjay");

    }

    public static void main(String[] args) {
        //passing lambda directly as parameter

        greet(name -> System.out.println("Namaste, " + name + "!"));
    }
}
