// package Polymorphism;


class A 
{
    public void show(){
        System.out.println("This is from A");
    }
}


class B extends A
{
    public void show(){
        System.out.println("This is from B");
    }
}

class C
{

    public void show(){
        System.out.println("This is from C");
    }

}

public class Demo {
    public static void main(String a[]){

        //Dynamic Method Dispatch
        A obj = new B(); 
        obj.show(); // calls A if B doesn't have show


        // NOW if B also has show()
        A newObj = new A();
        newObj.show(); // gives A show

        newObj = new B(); // gives B show


        //and if we try with not a child class
        newObj = new C(); // error : Type mismatch: cannot convert from C to A
        // yes because C is not of type A 

        
    }
}
