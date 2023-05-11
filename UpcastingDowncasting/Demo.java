
class A
{
    public void showA()
    {
        System.out.println("this form A");
    }
}

class B extends A
{
    public void showB()
    {
        System.out.println("this from B");
    }
}


public class Demo {
    public static void main(String a[]) {
        
        // A obj = new B();

        // or 

        A obj = (A) new B(); // is known as upcasting
        obj.showA(); 
        // obj.showB(); // error : The method showB() is undefined for the type A

        //B obj1 = obj; // error : Type mismatch: cannot convert from A to B
        B obj1 = (B) obj; // this is known as downcasting 
        obj1.showB(); // now we can access showB()
    }
}
