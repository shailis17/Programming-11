package unit07;

public class FirstCircle
{
    public static void main (String args[])
    {
        Circle c = new Circle();
        c.radius = 5;
        c.diameter = c.radius * 2;
        c.circumference = c.diameter * Math.PI;
        c.area = Math.pow(c.radius, 2) * Math.PI; 
        
        
        System.out.println("Radius: " + c.radius);
        System.out.println("Diameter: " + c.diameter);
        System.out.println("Circumference: " + c.circumference);
        System.out.println("Area: " + c.area);
    }
}