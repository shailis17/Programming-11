package unit06;
import java.util.*;

public class EvenOrOdd
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        evenOdd(num);
       
    }
    
    public static void evenOdd(int x)
    {
        if(x % 2 == 0)
        {
            System.out.print("The number is even.");
        }
        else
        {
            System.out.print("The number is odd.");
        }
    }
}