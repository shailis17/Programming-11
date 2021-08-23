package unit10;

public class Circle
{
    //declare instance data
    public double radius, diameter, circumference, area;
    
    public Circle()
    {
        
    }
    public Circle(double r)
    {
        radius = r;
        diameter = 2 * radius;
        circumference = diameter * Math.PI;
        area = Math.PI * Math.pow(radius, 2);
    }
    public void printAtt()
    {
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}