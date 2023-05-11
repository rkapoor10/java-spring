// package Inheritance;

//multiple inheritance is not supported in Java due to ambiguity problem

class A
{
    public void call(int n1, int n2)
    {
        System.out.println(n1+n2+"from A");
    }

    public void callA(){
        System.out.println("method from A");
    }
}


class B extends A
{
    // this is method overriding
    public void call(int n1, int n2, int n3)
    {
        System.out.println(n1+n2+n3+"from B");
    }

    public void callB(){  
        System.out.println("method from B");
    }

}

public class Demo {

    public static void main(String a[])
    {
        B obj = new B();
        obj.callA();
        obj.callB();
        obj.call(1,2 , 4);
    }
    
}
