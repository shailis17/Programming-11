package unit05;
import java.util.*;

public class PrimeV2
{
    public static void main(String args[])
    {
        int num;
        boolean prime = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number between 2 and 1000000: ");
        num = sc.nextInt();
        
        if(num >= 2 && num <= 1000000)
        {
            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    prime = false;
                }
            }
            if(prime)
            {
                System.out.print("The number is: Prime");
            }
            else
            {
                System.out.print("The number is: Composite");
            }
        }
        else
        {
            System.out.print("Invalid number... ");
        }
    }
}