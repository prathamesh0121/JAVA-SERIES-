import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StremAPI {
    public static void main(String[] args) {
        int sum =0;
        List<Integer> nums = Arrays.asList(4,5,1,2,6,7);
       
        // for(int i=0; i<nums.size();i++)         //Method 1
        // {
        //     int n =nums.get(i);

        //     if (n%2==0) 
        //     {
        //         n=n*2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);


        for(int n: nums)                     //Method 2
        {
            if (n%2==0) 
            {
                n=n*2;
                sum=sum+n;   
            }
        }
        System.out.println("Sum of double values:"+sum);

        System.out.println("Array list ");
        nums.forEach(n->System.out.println(n));   // for only disply the array list
        
}
}