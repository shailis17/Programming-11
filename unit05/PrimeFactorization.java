package unit05;
import java.util.*;

public class PrimeFactorization
{
    public static void main(String args[])
    {
        int num, factor = 2;
        String primeFactors = ("");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number between 2 and 1,000,000: ");
        num = sc.nextInt();
        
        if(num >= 2 && num <= 1000000)
        {
           System.out.print("The prime factorization of " + num  + " is: ");
           
           while(num != 1)
           {
             if(num % factor == 0)
             {
                 num /= factor;
                 primeFactors += factor + " ";
             }
             else
             {
                 factor++;
             }
           }
           
           System.out.print(primeFactors);
        }
        else
        {
            System.out.print("Invalid Input");
        }
        
    }
}