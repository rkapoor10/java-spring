 
class A extends Thread{  // check Thread -> Runnable -> run is present which is an abstract method which is Overriden
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

class B extends Thread{

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

public class Demo {

    public static void main( String a[]) {
        A obj1 = new A();
        B obj2 = new B();
        // obj1.show();
        // obj2.show();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }
}
