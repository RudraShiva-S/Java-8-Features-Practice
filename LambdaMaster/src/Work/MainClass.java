package Work;

import java.util.concurrent.Callable;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("My System Starts");

//        MyInter myInter =  new myInterImple();
//        myInter.SayHello();
//
//        MyInter i = new MyInter() {
//            @Override
//            public void SayHello() {
//                System.out.println("Thi is my first anonymous class");
//            }
//        };
//        i.SayHello();
//        MyInter i2 = new MyInter() {
//            @Override
//            public void SayHello() {
//                System.out.println("this is second anonymous class");
//            }
//        };
//        i2.SayHello();

        // Using our Interface with the help of a lambda expression
        MyInter i = () -> System.out.println("this is first time I using lambda expression");

        i.SayHello();

        MyInter i2 = () -> System.out.println("this is second time I using lambda expression");
        i2.SayHello();

        SumInter sumInter = (a ,  b)->  a+b;

        System.out.println(sumInter.sum(5, 10) );
        System.out.println(sumInter.sum(10, 20) );

        LengthInter lengthInter = (str)-> str.length();
        System.out.println("Lenght of the String " + lengthInter.getLength("Sanjay choudhary") );
    }
}
