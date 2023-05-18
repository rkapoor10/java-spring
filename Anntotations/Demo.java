// package Anntotations;

/*
 * So annotations are used to express a developers intent to the compiler
 * Its sort of meta data
 * and if you have experience in React, its like typescript
 * 
 */


class A
{
    public void somefunction()
    {
        System.out.println("From A");
    }
}


class B extends A
{
    @Override
    public void somefunctio()
    {
        System.out.println("From B");
    }
}

public class Demo {

    public static void main()
    {
        B obj = new B();
        obj.somefunction(); // from A, as the spelling is wrong

        /*
         * but if you add override annotation the compiler would tell you
         * that you wanted to override the method
         * but its not the method
         */
    }
    
}
