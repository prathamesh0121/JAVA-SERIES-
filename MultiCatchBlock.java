public class MultiCatchBlock {
    public static void main(String[] args) {
        int i =2;
        int j =1007;  // if j is not divide then print this defualt value

        int sums[]=new int[5];
        String str =null;

        try 
        {
            j= 18/i;
            System.out.println(sums[2]);
            System.out.println(sums[3]);
            System.out.println(str.length());  // use for string  .  
        } 
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero ");        // for j value
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Size of array is outoff bound ");  //for array 
        }
        catch (Exception e) 
        {
           System.out.println("Something wents Wrong "+e);   // use for string . if both division and array work correctly and string is not work correct then this exception block execute
        }

        System.out.println(j);

        System.out.println("Bye");
    }
    
}
