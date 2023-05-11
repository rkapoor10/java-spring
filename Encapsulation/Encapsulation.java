// package Encapsulation;
class Human{
    private int age;
   
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    
}

public class Encapsulation {
    public static void main(String a[]){

        Human obj = new Human();

        System.out.println("Hello Encapsulation");

        // System.out.println(obj.age); // this won't be accessible directly
        System.out.println(obj.getAge());

        obj.setAge(5);

        System.out.println(obj.getAge());


    }
}