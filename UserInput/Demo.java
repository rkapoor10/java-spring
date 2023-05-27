import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Demo
{
    public static void main( String a[] )
    {
        System.out.println("Taking user input");

        // taking single input integer
        // System.out.println("Enter a number");
        // try{
        //     int num = System.in.read();
        //     System.out.println(num-48); // as it only reads a single input and stores in ascii value

        // }
        // catch(IOException e){
        //     System.out.println("CAUGHT EXCEPTION"+e);
        // }


        // second method of taking user input

        // System.out.println("Enter a number");

        // try{

        //     InputStreamReader in = new InputStreamReader(System.in);
        //     BufferedReader bf = new BufferedReader(in);
        //     int num2 = Integer.parseInt(bf.readLine());

        //     System.out.println("num2 : "+ num2);

        //     // here bufferReader is a Resource as it can read a file or some other data as well
        //     // now when you user bufferReader u r using a resource , i.e resource is open
        //     // so, once done with the use, always close the resources 
        //     // because its a good practice to avoid : data leaks and if you are using a resource, no
        //     // one else can use it

        //     bf.close();
            
        // }
        // catch(IOException e){
        //     System.out.println("CAUGHT EXCEPTION"+e);
        // }



        // simple way to take input is by using Scanner class
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println("num3 from Scanner : " + num3);

    }
}