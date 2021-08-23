package unit04;
import java.util.*;

public class MySchedule
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int period;
        
        System.out.print("What class period?");
        period = sc.nextInt();
        
        System.out.print("I am in... ");
        
        switch(period)
        {
           case 1:
           System.out.print("AP World History");
           break;
           
           case 2:
           System.out.print("Pre-Calculas Honors");
           break;
           
           case 3:
           System.out.print("AP Physics 1");
           break;
           
           case 4:
           case 5:
           System.out.print("Study Hall");
           break;
           
           case 6:
           case 7:
           System.out.print("French 4H");
           break;
           
           case 8:
           case 9:
           System.out.print("Physical Education");
           break;
           
           case 10:
           System.out.print("Lunch");
           break;
           
           case 11:
           System.out.print("Programming");
           break;
           
           case 12:
           System.out.print("English 3H");
           break;
        }
        
    }
}