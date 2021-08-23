package unit05;
import java.util.*;

public class DontEnterZero
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String args[])
    {
        int num = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number that is not zero ");
        num = sc.nextInt();
        while(num != 0)
        {
            System.out.println("Good Job... have another go!");
            System.out.print("Enter a number that is not zero ");
            num = sc.nextInt();
        }
        
        System.out.print("YOU ENTERED ZERO!!!!!!");
    }
}