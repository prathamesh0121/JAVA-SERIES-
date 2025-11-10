import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(4,2,1,8,6,2,7);
        
        nums.forEach(n->System.out.println(n));
    }
}
