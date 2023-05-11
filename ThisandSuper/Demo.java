// package ThisandSuper;

class A
{
    public A()
    {
        System.out.println("in A");
    }

    public A(int n)
    {
        this();
        System.out.println("in A int");
    }
}


class B extends A
{
    public B()
    {
        super(5); // calls the parametrized constructor of super class
        System.out.println("in B");
    }
    public B(int n)
    {
        // super(n);
        this(); // call the default constructor of the same class / current class
        System.out.println("in B int");
    }
}


public class Demo {
    public static void main(String a[]){
        B obj = new B(5);
    }
}
