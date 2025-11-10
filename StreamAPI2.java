import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI2 {
    public static void main(String[] args) {
        
    List <Integer> nums = Arrays.asList(4,5,2,8,7,3,8);

    // Stream <Integer> s1 =nums.stream();                  //Method 1 
    // Stream <Integer> s2 =s1.filter(n->n%2==0);
    // Stream <Integer> s3 = s2.map(n->n*2);
    // int result =s3.reduce(0,(e,c)->e+c);

   int result = nums.stream()
                    .filter(n->n%2==0)
                    .map(n->n*2)
                    .reduce(0,(e,c)->e+c);
    
    System.out.println(result);
}
}
