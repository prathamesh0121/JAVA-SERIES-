import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourse {
    public static void main(String[] args)throws NumberFormatException ,IOException {
        
        int num =0;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) 
        {
            System.out.println("Enter the number");
            num = Integer.parseInt(bf.readLine());
        }
    }
}
