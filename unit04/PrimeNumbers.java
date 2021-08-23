package unit04;
import java.util.*;

public class PrimeNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter a number (between 2 and 100): ");
        num = sc.nextInt();
        
        if(num >=2 && num <=100)
        {
            if(num%2 == 0 && num!=2)
            {
                System.out.print(num + " is composite");
            }
            else if(num%3 == 0 && num!= 3)
            {
                System.out.print(num + " is composite");
            }   
            else if(num%5 == 0 && num!= 5)
            {
                System.out.print(num + " is composite");
            }
            else if(num%7 == 0 && num!= 7)
            {
                System.out.print(num + " is composite");
            }
            else if(num%11 == 0 && num!= 11)
            {
                System.out.print(num + " is composite");
            }
            else
            {
                System.out.print(num + " is prime");
            }
        }
        else
        {
            System.out.print("Not a valid number... try again!");
        }
    }
}