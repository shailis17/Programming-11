package unit10;
import java.util.*;

public class Max
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numInSet;
        
        System.out.print("How many numbers are in your dataset? ");
        numInSet = sc.nextInt();
        
        double[] arr = new double[numInSet];
        double largest = arr[0];
        
        System.out.println("Enter the numbers in your data set: ");
        for(int i = 0; i < arr.length; i++)
        {
           arr[i] = sc.nextDouble();
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        
        System.out.print("The largest value in your data set is: " + largest);
    }
}