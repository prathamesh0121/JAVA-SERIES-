import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws Exception{
        
       //Method 1 
            // System.out.println("Enter the number :");
            // int i=System.in.read();
            //System.out.println(i); // show the askii code
            //System.out.println(i-48); //not sutable for large number
       
        //Method 2
            // InputStreamReader ir = new InputStreamReader(System.in);
            // BufferedReader Bf = new BufferedReader(ir);  //use two line 

            // //BufferedReader Bf =new BufferedReader(new InputStreamReader(System.in)); // combine two lines in one line

            // System.out.println("Enter the number :");
            // int num =Integer.parseInt(Bf.readLine());
            // System.out.println(num);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number :");
            int nums =scanner.nextInt();
            System.out.println(nums);
            scanner.close();


            File file = new File("C:\\Users\\PRATHAMESH\\Desktop\\resume website.txt");
            try {
                Scanner scanner2 = new Scanner(file);
                while (scanner2.hasNextLine()) 
                {
                    String line =scanner2.nextLine();
                    System.out.println(line);
                }
                scanner2.close();
            } 
            catch(FileNotFoundException e) 
            {
               System.out.println("File Not Found "+e.getMessage());
            }
            
        


            String input ="123456789";
            Scanner scanner3 = new Scanner(input);
            while (scanner3.hasNextInt()) 
            {
                int number =scanner3.nextInt();
                System.out.println(number);
                
            }
            scanner3.close();

    }
    
}
