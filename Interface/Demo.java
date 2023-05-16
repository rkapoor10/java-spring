interface A 
{
    int age = 23;
    String area = "Mumbai";

    void show();
    void config();
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


public class Demo {
    public static void main(String a[])
    {

        A obj = new B();
        obj.show();
        // System.out.println(obj.age) // this won't work as variables are static : needs to referenced 
        // class names

        System.out.println("age : "+A.age+" "+"Area: "+A.area) ;

    }    
}
