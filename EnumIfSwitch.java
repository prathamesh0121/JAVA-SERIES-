import java.util.Scanner;

enum Status{
    start,running,stop,suceesfull;
}

public class EnumIfSwitch {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Status (start,running,stop,suceesfull)");
        String sts =scanner.next();

         Status ss = Status.valueOf(sts);

        try                                  //use if else with enum with user input using try catch block
        {
            Status s = Status.valueOf(sts);
        
            if(s==Status.start)
                System.out.println("Starting....");
            else if(s==Status.running)
                System.out.println("good working");
            else if(s==Status.stop)
                System.out.println("Restart the process");
            else if(s==Status.suceesfull)
                System.out.println("Done");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("enter invalid Status");
        }



        switch (ss) {                    // use switch case with enum using user input
            case start:
                System.out.println("Starting.... in switch");
                break;
            case running:
                System.out.println("good working in switch");
                break;
            case stop:
                System.out.println("Restart the process in switch");
                break;
            case suceesfull:
                System.out.println("Done in switch");
                break;
            default:
                System.out.println("Invalid Status");
                break;
        }
        
    }
    
}
