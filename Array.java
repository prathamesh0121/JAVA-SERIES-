public class Array {
    public static void main(String[] args) 
    {
        //int num [] ={4,5,6,7};

        int nums[]= new int[4];
         nums[0]=3;
         nums[1]=4; 
         nums[2]=5; 
         nums[3]=6;

        boolean flag[] =new boolean[4]; //by default false
        flag[0]=true;

        System.out.println("bolooen value are :");

        for(int j=0;j<flag.length;j++)
        {
            System.out.println(flag[j]);
        }
        

        System.out.println("integer value are:");
        
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        } 
    }

