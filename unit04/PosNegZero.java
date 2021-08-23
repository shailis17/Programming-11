package unit04;
import java.util.*;

public class PosNegZero
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double num;
        
        System.out.print("Enter a Number: ");
        num = sc.nextDouble();
        
        if(num > 0)
        {
            System.out.print(num + " is positive!");
        }
        else if(num < 0)
        {
            System.out.print(num + " is negative.");
        }
        else
        {
            System.out.print(num + " is zero.");
        }
    }
}