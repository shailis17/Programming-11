package unit05;
import java.util.*;

public class SumToNum
{
    public static void main(String args[])
    {
        //Write the program that asks the user for a number and then 
        //adds all integers from 1 to that number and prints the sum.
        
       int num, sum = 0;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter a number: ");
       num = sc.nextInt();
       
       for(int i = 0; i <= num; i++)
       {
           sum = sum + i;
       }
       System.out.print("The sum of the numbers is " + sum);
       
    }
}