package unit04;
import java.util.*;

public class SwitchDate
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int month, day, year;
        boolean valid = true;
        
        System.out.print("Enter the month as a number: ");
        month = sc.nextInt();
        System.out.print("Enter the day: ");
        day = sc.nextInt();
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        
        switch(month)
        {
            case 1:
                System.out.print("January");
                break;
                
            case 2:
                System.out.print("February");
                break;
                
            case 3:
                System.out.print("March");
                break;
                
            case 4:
                System.out.print("April");
                break;
            
            case 5:
                System.out.print("May");
                break;
            
            case 6:
                System.out.print("June");
                break;
                
            case 7:
                System.out.print("July");
                break;
            
            case 8:
                System.out.print("August");
                break;
                
            case 9:
                System.out.print("September");
                break;
                
            case 10:
                System.out.print("October");
                break;
                
            case 11:
                System.out.print("November");
                break;
                
            case 12:
                System.out.print("December");
                break;
                
            default:
                System.out.print("Invalid month");
                valid = false;
            
        }
        
        if(valid)
        {
            System.out.print(" " + day + ", " + year);
        }
        
    }
}