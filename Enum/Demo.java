// package Enum;
// enum or enumeration are name constant
/*
 * These constants are defined in enum class and act like objects
 * Index for them starts from 0
 * and there are some predefined methods, such as 
 * ordinal() -> gives order of constant
 * values() -> gives array of all constants
 */
enum Status 
{
    Running, Halted, Terminated, Success
}

public class Demo {
    
    public static void main(String a[]){
        Status s = Status.Halted;
        System.out.println(s + " " + s.ordinal());


        Status[] arr = Status.values();
        for(Status status : arr){
            System.out.println(status + " " + status.ordinal());
        } 


        Status current = Status.Running;

        switch(current){
            case Running:
                System.out.println("Running...");
                break;
            case Halted:
                System.out.println("Paused for now");
                break;
            case Terminated:
                System.out.println("It has terminated");
                break;
            default:
                System.out.println("Done");

        }
    }

}

