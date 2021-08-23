package unit06;
import java.util.*;
import java.text.DecimalFormat;

public class SAVC //Calculates Surface Area & Volume of a Cylinder
{
    public static void main (String args[])
    {
        double r, h, SA, V;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.###");
        
        System.out.print("Enter the radius of the cylinder: ");
        r = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        h = sc.nextDouble();
        
        //calculate SA
        SA = (getC(r) * h) + (2* getA(r));
        
        //calculate V
        V = getA(r) * h;
        
        System.out.println("The Surface Area of the cylinder is: " + df.format(SA));
        System.out.println("The Volume of the cylinder is: " + df.format(V)); 
    }
    public static double getC(double r)
    {
        return 2 * Math.PI * r;
    }
    public static double getA(double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
}