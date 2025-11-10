import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduceSorted {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(4,2,1,3,8,5,7,6);

        // Predicate<Integer> P =new Predicate<Integer>() {          //For object of filter and this is in the filter using lambada expression
        //     public boolean test (Integer n)
        //     {
        //         return n%2==0;
        //     }
        // };

        // Function <Integer,Integer> fun = new Function<Integer,Integer>() {   // For object of map 
        //     public Integer apply(Integer n)
        //     {
        //         return n* 2;
        //     }
        // };

        int result= nums.stream()
                        .filter(n->n%2==0)                         //direct equation assign
                        .map(n->n*2)                               // direct equation of map
                        .reduce(0,(c,e)->c+e);            // 0 is intilized value and c is carray and e is element

        System.out.println(result);
    }
}
