/*
 * Now, its not a good practice to extend thread
 * suppose we want to extend another class for A. Now, multiple inheritance is not supported in Java
 * So, what we do instead is implement the Runnable interface, which even the Thread class Implements
 */

class A implements Runnable { // check Thread -> Runnable -> run is present which is an abstract method which
                              // is Overriden
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println("hi");
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught" + e);
            }
        }
    }
}

class B implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println("hello");
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught" + e);
            }
        }
    }
}

public class Demo3 {

    public static void main(String a[]) {

        // Runnable obj1 = new Runnable() {
        // @Override
        // public void run() {
        // for (int i = 0; i <= 100; i++) {
        // try {
        // Thread.sleep(100);
        // System.out.println("hello");
        // } catch (InterruptedException e) {
        // System.out.println("Interrupted Exception caught" + e);
        // }
        // }
        // }
        // };

        Runnable obj1 = () -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("hi");
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception caught" + e);
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("hello");
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception caught" + e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
