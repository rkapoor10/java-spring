// package FinalKeyword;

public class Demo {

    public static void main(String a[])
    {
        int temp = 3;
        temp = 5;
        System.out.println(temp); // gives 5

        //but

        final int tempo = 6;
        // tempo = 5;
        System.out.println(tempo); // error : error: cannot assign a value to final variable tempo [ compile time error ]

    }
    
}
