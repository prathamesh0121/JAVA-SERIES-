public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        
        int i =0;
        int j =5;
        try                  
        {
            j=18/i;         // Exception येऊ शकणारा कोड
        } 
        catch (Exception e)  // to hadle the exception
        {
            System.out.println("Something is wrong");    // Exception Handle करण्याचा कोड
        }

        System.out.println(j);  // this j print value 5  // हा block नेहमी execute होतो (optional)

        System.out.println("your code is working properly");
    }
    
}
