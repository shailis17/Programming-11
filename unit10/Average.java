package unit10;
import java.util.*;

public class Average
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numInSet;
        
        System.out.print("How many numbers are in your dataset? ");
        numInSet = sc.nextInt();
        
        double[] arr = new double[numInSet];
        double sum = 0, average;
        
        System.out.println("Enter the numbers in your data set: ");
        for(int i = 0; i < arr.length; i++)
        {
           arr[i] = sc.nextDouble();
        }
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        average = sum/numInSet;
        
        System.out.print("The average of your data set is: " + average);
    }
}