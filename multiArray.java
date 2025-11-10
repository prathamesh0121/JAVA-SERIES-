public class multiArray {
    
    public static void main(String[] args) 
    {
        int nums [] []=new int[3][4];

        //1st method Normal for loop 

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                nums [i][j]= (int)(Math.random()*10); // this line is used for take a random value by computer it self

                System.out.print(nums[i][j]+" "); 
            }
            System.out.println();
        }

        //Either use 2nd method Enhanced for loop
        
        for(int n[]:nums)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

}
