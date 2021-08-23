package unit05;
import java.util.*;
import java.text.DecimalFormat;

public class Average
{
    public static void main(String args [])
    {
        int count = -1;
        double grade = 0, sum = 0, avg, SENTINEL = -1;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        
        System.out.println("Enter your grades until you are done. Enter -1 to stop");
        
        while(grade != SENTINEL)
        {
            sum += grade;
            count++;
            grade = sc.nextDouble();
        }
        
        avg = sum/count;
        
        System.out.print("Your average is: " + df.format(avg));
    }
}