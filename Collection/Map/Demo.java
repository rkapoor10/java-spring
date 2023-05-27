// package Collection.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo {

    public static void main(String a[]) {

        Map<String, Integer> students = new HashMap<>();

        /*
         * Note that this implementation is not synchronized.</strong>
         * If multiple threads access a hash map concurrently, and at least one of
         * the threads modifies the map structurally, it <i>must</i> be
         * synchronized externally.
         */

        Map<String, Integer> stud = new Hashtable<>();

        /*
         * * Java Collections Framework</a>. Unlike the new collection
         * implementations, {@code Hashtable} is synchronized.
         */

        students.put("Vaib", 45);
        students.put("Geeta", 34);
        students.put("Vihan", 87);
        students.put("Sita", 45);
        students.put("Vaib", 78);
        students.replace("Vihan", 98);

        System.out.println(students.keySet());
        System.out.println(students.values());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
