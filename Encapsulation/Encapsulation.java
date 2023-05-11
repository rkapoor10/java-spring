// package Encapsulation;
class Human{
    private int age;
   
    private String name;

    

    public Human() { // default constructor
    }
    public Human(int age, String name) { // parametrized constructor
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this refers to the current obj which is calling the object
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