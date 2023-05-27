/*
 * Now, its not a good practice to extend thread
 * suppose we want to extend another class for A. Now, multiple inheritance is not supported in Java
 * So, what we do instead is implement the Runnable interface, which even the Thread class Implements
 */




class A implements Runnable{  // check Thread -> Runnable -> run is present which is an abstract method which is Overriden
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try{
                Thread.sleep(100);
                System.out.println("hi");
            }
            catch(InterruptedException e){
                System.out.println("Interrupted Exception caught" + e);
            }
        }
    }
}

class B implements Runnable{

    @Override
    public void run() {  
        for (int i = 0; i <= 100; i++) {
            try{
                Thread.sleep(100);
                System.out.println("hello");
            }
            catch(InterruptedException e){
                System.out.println("Interrupted Exception caught" + e);
            }
        }
    }
}

public class Demo2 {

    public static void main( String a[]) {
        // A obj1 = new A();
        // B obj2 = new B();


        /*
         * once you implement the Runnable interface
         * you lose access to start method as it is a method of the thread class
         * so, we create a new object of Thread class
         */

        // obj1.start();
        // obj2.start();

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // thread takes a runnable obj in its constructor

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // create two threads but they won't have access to obj1 and obj2

        t1.start();
        t2.start();

    }
}


// now this whole thing can be written as lambda expression as Runnable is a functional Interface
// refer to Demo3.java