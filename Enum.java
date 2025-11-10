enum Status
{
    Start,Running,Failed,Sucessfull;
}
public class Enum {
    public static void main(String[] args) {

        // Status ss= Status.Start;      // Method 1 disply single values
        // ss.ordinal();


        // Status[] ss =Status.values();   //show array with index wise values
        // System.out.println(ss[2]);


        Status [] ss= Status.values();       // using enhanced for loop show all values at a time

        for(Status s :ss)
        {
            System.out.println(s+ ":"+s.ordinal());   //ordina method show the index value
        }
    }
    
}
