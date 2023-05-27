
class Counter {
    private int count=0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}

public class Demo {

    public static void main(String a[]) {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // join method will tell the main function to stop execution and wait for t1 and t2 threads to complete
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println("Caught Exception" + e);
        }
      
        System.out.println(c.getCount());

    }
}
