// package Collection.Sorting Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



class Family implements Comparable<Family>{

    int age;
    String name;

    public Family(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Member [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Family that){
        if( this.age >= that.age){
            return 1;
        }else return -1;
    }

}
class Students{

    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
    
}
public class Demo {

    public static void main( String a[]){

        List<Integer> marks = new ArrayList<Integer>();

        marks.add(5);
        marks.add(4);
        marks.add(3);
        marks.add(7);
        marks.add(5);

        // sorting the above list 
        // we use the collections class 

        Collections.sort(marks);

        Iterator<Integer> values = marks.iterator();

        while(values.hasNext())
            System.out.println(values.next());


        // now lets try to sort a string 

        System.out.println("now lets try to sort a string based on string length");

        List<String> studentNames = new ArrayList<String>();

        studentNames.add("Aman");
        studentNames.add("Vaib");
        studentNames.add("Banerjee");
        studentNames.add("Vihan");
        studentNames.add("Tree");

        Comparator<String> cmp = new Comparator<String>() {

            public int compare(String a, String b){
                System.out.println(a+ " " + b);
                if(a.length() >= b.length()) {
                    System.out.println("swapped");
                    return 1;
                }
                else return -1;
            }
            
        };
        Collections.sort(studentNames,cmp );

        Iterator<String> names = studentNames.iterator();
        
        while(names.hasNext()) System.out.println(names.next());




        // we can also have a different class objects and compare them

        List<Students> studs = new ArrayList<Students>();

        studs.add(new Students(45, "Harsh"));
        studs.add(new Students(53, "Mark"));
        studs.add(new Students(42, "Gaurav"));
        studs.add(new Students(42, "Rikt"));
        studs.add(new Students(46, "Taran"));  // very old students


        //Collections.sort(studs); // Integer implements comparable, because of which we can use Sort directly
 
        // Here Comparator is a functional Interface so we can, use Lambda Expression
        Comparator<Students> comp = (x , y) ->  (x.age >= y.age ) ?  1 : -1 ;
        Collections.sort(studs, comp) ; 
        for(Students s : studs) {
            System.out.println(s.toString());
        }



        // we can also have a different class objects and compare them

        List<Family> members = new ArrayList<Family>();

        members.add(new Family(45, "papa"));
        members.add(new Family(53, "bade papa"));
        members.add(new Family(42, "mami"));
        members.add(new Family(42, "mummy"));
        members.add(new Family(46, "mama")); 


        //Collections.sort(members); // Integer implements comparable, because of which we can use Sort directly

      
        Collections.sort(members) ; 
        for(Family s : members) {
            System.out.println(s.toString());
        }



    }
    
}
