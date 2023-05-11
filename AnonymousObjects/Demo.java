// package AnonymousObjects;


class Ano
{
    public Ano()
    {
        System.out.println("creating obj");
    }

    public void show(){
        System.out.println("method of class A");
    }
}

public class Demo {

   public static void main(String A[]){
        new Ano(); // this is an anonymous object 
        // anonmymous objs cannot be reused unlike reference objs
        // but you can use methods for once
        new Ano().show();


   }
}
