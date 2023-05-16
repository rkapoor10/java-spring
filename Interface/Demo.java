import java.security.PublicKey;

interface A 
{
    int age = 23; //final and static
    String area = "Mumbai";

    void show(); // abstract and public
    void config();
}


interface X
{
    void fromX();
}

class B implements A
{
    public void show(){
        System.out.println("This is show");
    }

    public void config(){
        System.out.println("This is config");
    }
}


//we can also implement multiple interfaces unlike classes which can 
// only extend a single class

class C implements A,X
{
    public void show(){
        System.out.println("This is show");
    }

    public void config(){
        System.out.println("This is config");
    }

    public void fromX(){
        System.out.println("This is from X interface");
    }
}





public class Demo {
    public static void main(String a[])
    {

        A obj = new B();
        obj.show();
        // System.out.println(obj.age) // this won't work as variables are static : needs to referenced 
        // class names

        System.out.println("age : "+A.age+" "+"Area: "+A.area) ;


        A obj1 = new C();
        obj1.show();

        /**
         * Also to implement the methods, the reference should be of that interface
         * as, obj cannot run method fromX()
         */

        //  obj.fromX(); // undefined for type A

        X obj2 = new C();
        obj2.fromX();  // this will work 

        C obj3 = new C(); // changing the reference to C to implement both methods from same object

        obj3.show();
        obj3.fromX();




    }    
}
