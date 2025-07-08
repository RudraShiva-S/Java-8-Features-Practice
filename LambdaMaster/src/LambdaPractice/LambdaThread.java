package LambdaPractice;

//lambda with thread
public class LambdaThread {
//    public static void main(String[] args) {
//
//        //create a thread using lambda expression for Runnable interface
//        Runnable task = ()->
//            System.out.println("Running in thread: " + Thread.currentThread().getName());
//
//            //create and start the thread
//          Thread t = new Thread(task);
//          t.start();  //prints from new thread
//
//    }

    //same task different approch
    public static void main(String[] args) {

        //create a threa using lambda

        Runnable task = ()-> System.out.println("Running a task with lambda in thread");

        //start the method
        new Thread(task).start();  //print from main thread
    }

}
