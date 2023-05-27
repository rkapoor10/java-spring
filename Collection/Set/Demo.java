// package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

    public static void main(String a[]) {

        System.out.println("With HashSet");
        Set<Integer> set = new HashSet<Integer>();

        set.add(51);
        set.add(44);
        set.add(42);
        set.add(63);
        set.add(51);

        for (int n : set) {
            System.out.println(n);
        }

        /*
         * 51
         * 42
         * 44
         * 63
         * this is not in sorted order
         */


        System.out.println("With tree set");

        Set<Integer> set1 = new TreeSet<Integer>();  // this has sorted implement hence prints in sorted order

        set1.add(51);
        set1.add(44);
        set1.add(42);
        set1.add(63);
        set1.add(51);


        Iterator<Integer> values = set1.iterator();

        while(values.hasNext())
            System.out.println(values.next());

    }
}
