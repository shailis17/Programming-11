package unit04;
import java.util.*;

public class NestingPractice
{
    public static void main(String [] args)
    {
        int num, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if(num % 2 == 0)
        {
            if(num % 3 == 0)
            {
                System.out.println("The number " + num + " is divisible by 6");
            }
        }
        
        System.out.print("Enter another number: ");
        num2 = sc.nextInt();
        
        if(num % 2 == 0 && num % 3 == 0)
        {
            System.out.print("The number " + num2 + " is also divisible by 6");
        }
    }
}