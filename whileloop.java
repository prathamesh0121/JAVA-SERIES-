public class whileloop {
    public static void main(String[] args) 
    {
        int i=1;   //outer loop
        while (i<=5)
         {
            System.out.println("hii "+i);
            int j=0;    // nested while loop //inner loop
            while (j<=1)
            {
                System.out.println("hello "+j);
                j++;
                
            }
            i++;
        }
        
        System.out.println("bye "+i);
    
    }
    
}
