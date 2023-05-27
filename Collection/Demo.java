// package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    
    public static void main( String a[])
    {
        System.out.println("Lets look at Array List");

        Collection nums = new ArrayList();

        nums.add(4);
        nums.add(3);
        nums.add(7);
        nums.add(2);
        // nums.add("3");

        // for(int n : nums){  // just nums gives type error
        //     System.out.println(n);
        // }

        for(Object n : nums){  

            int no = (Integer) n;
            System.out.println(no);
        }

        // the above code will work just fine

        /*
         * but suppose we added something like - 
         * nums.add("3"); a string
         * 
         * 
         * for this we don't get any syntax errors or compile time errors / exceptions
         * 
         * BUT we get a run time exception
         * 
         * Exception in thread "main" java.lang.ClassCastException: class java.
         * lang.String cannot be cast to class java.lang.Integer
         * (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
         * at Demo.main(Demo.java:26)
         * 
         */


        /* Its always better to face exceptions or errors at compile time
         * so to avoid such exceptions at run time
         * we use Generics i.e we define the type of ArrayList and all other collection api data structures
         */

        Collection<Integer> numArray = new ArrayList<Integer>();

        numArray.add(5);
        numArray.add(6);
        numArray.add("4"); // gives an error at compile time

        for(int n : numArray) {
            System.out.println(n);
        }


        /*
         * Also through collection reference we cannot access index or other properties 
         * 
         */

        
        List<Integer> list = new ArrayList<Integer>();

        list.add(6);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(8);

        System.out.println("index" + list.indexOf(4)); // returns 1;
        System.out.println("index" + list.indexOf(5)); // returns 1;



        




        

         


    }
}
