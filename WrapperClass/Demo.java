// package WrapperClass;


/**
 * Need of Wrapper Class
 * So, Java is 99.9% object oriented 
 * as everything is an Object in java and extends from Object Class
 * But
 * primitive data types like double, int, char etc are having fixed size
 * this makes it performant as it is not stored in heap as object and acc
 * access is fast
 * but some java frameworks only work with objects 
 * so, Java introduced wrapper class, 
 * where these primitive data types can be wrapped by a class and hence be 
 * treated as objects
 */

public class Demo {

    public static void main(String a[]){


        int b=5;
        Integer bO = new Integer(b); // this is boxing // here the strikethrough indicates deprication
        // we have a better syntax

        Integer bObj = b; // this is autoboxing


        // UNboxing : getting the value from object type to primitive type

        int bInt = bObj.intValue(); // unboxing

        int bIntAuto = bObj; //this is auto unboxing



        // now suppose you have a string no
        // but you want to do some operations

        String str = "12";
       // System.out.println(str*12); // error 

        // so, through Integer class we can convert string to int

        int num = Integer.parseInt(str);
        System.out.println(num*12);






    }
    
}
