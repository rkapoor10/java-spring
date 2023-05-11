


class A
{
    //Let's override the toString() method of Object Class
    // public String toString(){
    //     return "this is a string now";
    // }

    // ALSO, we can generate some functions from IDE
    // for this right click and go to Source Action...
    String name;
    int price;

    // generated hashcode() and equals method for both the instance variables
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // also lets get a toString method generated
    @Override
    public String toString() {
        return "A [name=" + name + ", price=" + price + "]";
    }


    
    
    

}


public class Demo
{
    // every class in Java extends from Object class
    // hence every class can access the methods of Object class

   public static void main(String a[])
   {
        A obj = new A();
        System.out.println(obj.toString()); //className@hashcode

        System.out.println(obj); // className@hashcode

   }
    

}