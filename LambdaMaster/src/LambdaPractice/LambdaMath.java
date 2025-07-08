package LambdaPractice;

interface MathOperations {
    int  operate(int a, int b);
}
public class LambdaMath {
    public static void main(String[] args) {

        //define lambdas
        MathOperations add = (a,b) -> a+b;
        MathOperations sub = (a,b) -> a-b;
        MathOperations mul = (a,b) -> a*b;

        System.out.println("Addition: " + add.operate(10,5));
        System.out.println("subtraction: " + sub.operate(10,5));
        System.out.println("Multiplication: " + mul.operate(10,5));
    }
}
