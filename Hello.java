// import pckgs.temp.Test;

class Calculator{
    int a; //this is instance variable
    public int add(int no1, int no2) // variables no1 and no2 are local vars
    {
        int sum = no1 + no2; 
        return sum;
    }

    public double add(int no1){ // method overloading
        return 0.0;
    }
}

public class Hello{
    public static void main(String a[]) {
        
        Calculator calc = new Calculator();
        double result = calc.add(4);
        System.out.println("Hello");

        // Test obj = new Test();
        // obj.call();
    }
}