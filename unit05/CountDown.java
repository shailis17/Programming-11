package unit05;
import java.util.*;

public class CountDown
{
    public static void main(String args[])
    {
       int num;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter a number: ");
       num = sc.nextInt();
       
       for(int i = num; i >= 0; i--)
       {
           System.out.println(i);
       }
       System.out.println("Blast off!!!");
    }
}