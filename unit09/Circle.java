package unit09;

public class Circle
{
    //declare instance data
    private double radius, diameter, circumference, area;
    
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
    public void diameterSolve()
    {
        radius = diameter/2;
        circumference = 2 * diameter;
        area = Math.PI * Math.pow(radius, 2); 
    }
    public void areaSolve()
    {
        radius = Math.sqrt(area/Math.PI);
        diameter = 2 * radius;
        circumference = diameter * Math.PI;
    }
    public void circumferenceSolve()
    {
        diameter = circumference/Math.PI;
        radius = diameter/2;
        area = Math.PI * Math.pow(radius, 2); 
    }
    public void printAtt()
    {
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
    //setter getter methods
    public void setRadius(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setDiameter(double d)
    {
        diameter = d;
    }
    public double getDiameter()
    {
        return diameter;
    }
    public void setCircumference(double c)
    {
        circumference = c;
    }
    public void setArea(double a)
    {
        area = a;
    }
}