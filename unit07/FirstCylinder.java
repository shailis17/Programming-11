package unit07;
import java.text.DecimalFormat;

public class FirstCylinder 
{
    public static void main(String[] args) 
    {
        DecimalFormat df = new DecimalFormat("###.###");
        double SA, V;
        
        //Cylinder
        Cylinder cyl = new Cylinder();
        cyl.radius = 4;
        cyl.height = 11;
        //Circle
        Circle c = new Circle();
        c.radius = cyl.radius;
        c.circumference = 2 * Math.PI * c.radius;
        c.area = Math.PI * Math.pow(c.radius, 2);
        //store the circle object to the Cylinder object
        cyl.base = c;
        
        //calculate SA
        SA = (c.circumference * cyl.height) + (2*c.area);
        
        //calculate V
        V = c.area * cyl.height;
        
        System.out.println("The Surface Area of the cylinder is: " + df.format(SA));
        System.out.println("The Volume of the cylinder is: " + df.format(V)); 
    }
    
}