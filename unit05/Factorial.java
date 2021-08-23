package unit05;
import java.util.*;

public class Factorial
{
    public static void main(String args[])
    {
        int num, factorial = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 16: ");
        num = sc.nextInt();
        
        if(num >= 0 && num <= 16)
        {
            if(num == 0)
            {
                System.out.print("The factorial of " + num + " is " + factorial);
            }
            else
            {
                for(int i = num; i > 0; i--)
                {
                    factorial = factorial*i;
                }
                System.out.print("The factorial of " + num + " is " + factorial);
            }
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}