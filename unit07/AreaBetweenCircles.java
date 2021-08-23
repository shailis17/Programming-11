package unit07;
import java.util.*;
import java.text.DecimalFormat;

public class AreaBetweenCircles
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        //inner circle
        Circle inner = new Circle();
        System.out.print("Enter the smaller circle's radius: ");
        inner.radius = sc.nextDouble();
        inner.diameter = inner.radius * 2;
        inner.circumference = inner.diameter * Math.PI;
        inner.area = Math.pow(inner.radius, 2) * Math.PI; 
        
        System.out.println("Smaller circle:");
        System.out.println("Radius: " + inner.radius);
        System.out.println("Diameter: " + inner.diameter);
        System.out.println("Circumference: " + df.format(inner.circumference));
        System.out.println("Area: " + df.format(inner.area) + "\n");
        
        //outer circle
        Circle outer = new Circle();
        System.out.print("Enter the larger circle's radius: ");
        outer.radius = sc.nextDouble();;
        outer.diameter = outer.radius * 2;
        outer.circumference = outer.diameter * Math.PI;
        outer.area = Math.pow(outer.radius, 2) * Math.PI; 
        
        System.out.println("Larger circle:");
        System.out.println("Radius: " + outer.radius);
        System.out.println("Diameter: " + outer.diameter);
        System.out.println("Circumference: " + df.format(outer.circumference));
        System.out.println("Area: " + df.format(outer.area) + "\n");
        
        //Area between
        double areaBetween;
        
        areaBetween = outer.area - inner.area;
        System.out.print("The area between the two circles is: " + df.format(areaBetween));
        
    }
}