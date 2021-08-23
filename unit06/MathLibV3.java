package unit06;
import java.util.*;
import java.text.DecimalFormat;

public class MathLibV3 
{
    static Scanner sc = new Scanner(System.in);
    static double x1, y1, x2, y2;
    static  DecimalFormat df = new DecimalFormat("#.##");
    
    public static void main(String[] args) 
    {
        int choice;
        do
        {
            System.out.println("Choose from the following");
            System.out.println("1. Distance\n2. Midpoint\n3. Slope\n0. Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    distance();
                    break;
                case 2:
                    midpoint();
                    break;
                case 3:
                    slope();
                    break;
                case 0:
                    System.out.println("Program Terminated");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        while(choice != 0);
    }
    
    public static void distance()
    {
        double xDiff, yDiff, distance; 
                
        System.out.println("You have chosen: Distance Formula");
        System.out.println("Enter x1: ");  
        x1 = sc.nextDouble();
        System.out.println("Enter y1: ");
        y1 = sc.nextDouble();
        System.out.println("Enter x2: ");
        x2= sc.nextDouble();
        System.out.println("Enter y2: ");
        y2 = sc.nextDouble();   
                
        xDiff = x2 - x1;
        yDiff = y2 - y1;
        distance = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    
        System.out.println("The distance between the two points is: " + df.format(distance));      
    }
    
    public static void midpoint()
    {
        double xAvg, yAvg;
                
        System.out.println("You have chosen: Midpoint Formula");
        System.out.println("Enter x1: ");  
        x1 = sc.nextDouble();
        System.out.println("Enter y1: ");
        y1 = sc.nextDouble();
        System.out.println("Enter x2: ");
        x2= sc.nextDouble();
        System.out.println("Enter y2: ");
        y2 = sc.nextDouble();
        
        xAvg = (x1 + x2)/2;
        yAvg = (y1 + y2)/2;
    
        System.out.println("The midpoint of the two points is:  (" + df.format(xAvg) + ", " + df.format(yAvg) + ")");     
    }
    
    public static void slope()
    {
        double xDiff, yDiff, slope;
        System.out.println("You have chosen: Slope Formula");
        
        System.out.println("Enter x1: ");  
        x1 = sc.nextDouble();
        System.out.println("Enter y1: ");
        y1 = sc.nextDouble();
        System.out.println("Enter x2: ");
        x2= sc.nextDouble();
        System.out.println("Enter y2: ");
        y2 = sc.nextDouble();
            
        xDiff = x2 - x1;
        yDiff = y2 - y1;
        slope = yDiff/xDiff;
    
        System.out.println("The slope of the two points is: " + df.format(slope));
    }
}