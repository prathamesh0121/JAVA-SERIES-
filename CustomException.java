class prathameshException extends RuntimeException
{
    public prathameshException(String str)
    {
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        
        int i=20;
        int j=0;

        try {
            j=18/i;
                if (j==0)
                    throw new prathameshException("I dont want to print zero");
        } 
        catch (prathameshException e)
        {
            j=18/1;
            System.out.println("Default output is "+e);
        }
        catch (Exception e) {
           System.out.println("Something wents wrong");
        }
        System.out.println("Bye");

        System.out.println(j);
    }
}

class NavinException extends Exception
{
	public NavinException(String string)
	{
		super(string);
	}
}
