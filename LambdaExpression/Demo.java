// package LambdaExpression;


/*
 * Lambda Expression is a syntactic sugar
 * It only works with a function interface
 */

@FunctionalInterface
interface A{
    void show(int i);
}


@FunctionalInterface
interface B
{
    int display(int i);
}


public class Demo {

    public static void main(String A[])
    {

        A obj = new A() {
            public void show(int i){
                System.out.println("This is not lambda"+i);
            }
        };
        obj.show(5);

        A obj2 = i -> System.out.println("this is lambda"+i);

        obj2.show(6);


        B obj3 = i -> i;

        System.out.println("Returned value"+ obj3.display(45));


    
    }
}
