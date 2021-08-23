package unit05;
import java.util.*;
import java.text.DecimalFormat;

public class MathLibV2
{
    public static void main(String args [])
    {
        int choice;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
      
        double x1, x2, y1, y2;
        
        while(run)
        {
        System.out.println("What would you like to do?");
        System.out.print("1. Distance Formula\n2. Midpoint Formula\n3. Slope Formula\n4. End Program \n");
        choice = sc.nextInt();
       
        
            switch(choice)
            {
                case 1: //Distance formula
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
            
                System.out.println("The distance between the two points is: " + df.format(distance) );
                break;
     
                case 2: //Midpoint formula
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
                break;
                
                case 3: //slope formula
                double slope;
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
                break;
                
                case 4:
                run = false;
                
                default: //invalid choice
                System.out.print("Not an option... ");
                break;
            }
        }
        System.out.print("PROGRAM TERMINATED");
}

}