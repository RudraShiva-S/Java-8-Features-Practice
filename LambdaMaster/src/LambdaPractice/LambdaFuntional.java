package LambdaPractice;

//Custom Functional interface
interface MathOperation{
    int operate(int a, int b);  //Funtional interface with one abstract method
}

public class LambdaFuntional {

    public static void main(String[] args) {

        //lambda for addition
        MathOperation add = (a,b) -> a + b;

        //lambda for multiplication
        MathOperation multiply = (a, b) -> a * b;

        //use the lambdas
        System.out.println("Addition: " + add.operate(5,9));
        System.out.println("Multiplication: " + multiply.operate(5,9));

    }
}
