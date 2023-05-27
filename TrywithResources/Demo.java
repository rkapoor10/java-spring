import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main ( String a[]) throws IOException
    {
        // BufferedReader bf = null;
        // System.out.println("Enter your name ");
        // try{

        //     InputStreamReader in = new InputStreamReader(System.in);
        //      bf = new BufferedReader(in);
            
        //     String name = bf.readLine();
        //     System.out.println("Your name : " + name);
        // }
        // // catch(IOException e){
        // //     System.out.println("Handled Exception" + e);
        // // }
        // finally{
        //     bf.close();
        // }


       
        System.out.println("Enter your name ");
        /*
         * BufferReader would automatically close the resource because, it extends from a closeable class
         */
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){ // mentioning it in try will automatically close the resource

            String name = bf.readLine();
            System.out.println("Your name : " + name);
        }
        // catch(IOException e){
        //     System.out.println("Handled Exception" + e);
        // }
        
    }
    
}
