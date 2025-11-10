import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCollection {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                {
                    return 1;
                }
                else
                    return -1;
            }
        };

        List<Integer>nums = new ArrayList<>();
        nums.add(54);
        nums.add(65);
        nums.add(21);
        nums.add(87);
        nums.add(33);

        
        //Collections.sort(nums);    // Normal sorting
        Collections.sort(nums,com);  // comparator Sorting

        System.out.println(nums);
    }
}
