import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>(5);  // For Noramal value access we use Collection 

        List <Integer> nums = new ArrayList<Integer>(5);           // For access the value using index we use the List 
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(6));

       System.out.println("--------------------------------------------");

        for(int n :nums)
        {
            System.out.println(n);
        }
    }
}
