// package EnumExpanded;

/*
 * There are few more things which we can do with Enum
 * - create Constructors
 * - define our own variable and methods
 */


enum Laptop{
    Mackbook(2000), XPS(3000), Surface(2200), ThinkPad(1800)

    private int price;

    private Laptop(){
        price = 500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class Demo {

    public static void main(String a[]){

        for(Laptop laptop : Laptop.values()){
            System.out.println(laptop + "" + laptop.getPrice());
        }

    }
    
}
