// package Collection.Sorting Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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

    }
    
}
