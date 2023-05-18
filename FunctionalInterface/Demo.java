// package FunctionalInterface;


/*
 * FUNCTION INTERFACE 
 * a interface which has just one method
 * to keep a functional interface in check you can have - @FunctionalInterface annotation
 * 
 */

@FunctionalInterface
interface A
{
    void show();
    // void see(); // this is another method which should not be there
}

class B implements A
{
    public void show(){
        System.out.println("Hi I'm from a functional interface");
    }
}





public class Demo {

    public static void main(String a[]){

    }
    
}
