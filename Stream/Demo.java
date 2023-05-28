// package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

    public static void main( String a[])
    {
        List<Integer> nums =  Arrays.asList(6,3,2,7,8,4,2,1);


        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int s = s3.reduce(0, (c,p) -> c+p);
        

        int s = nums.stream()
                    .filter(n -> n%2 ==0)
                    .map(n -> n*2)
                    .reduce(0, (c,p) -> c+p);

        System.out.println(s);
    }
    
}
