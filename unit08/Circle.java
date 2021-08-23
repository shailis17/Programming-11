package unit08;

public class Circle
{
    //declare instance data
    public double radius, diameter, circumference, area;
    
    public Circle()
    {
        
    }
    public Circle(double r)
    {
        this.radius = r;
        this.diameter = 2 * this.radius;
        this.circumference = this.diameter * Math.PI;
        this.area = Math.PI * Math.pow(this.radius, 2);
    }
    public void diameterSolve()
    {
        this.radius = this.diameter/2;
        this.circumference = 2 * this.diameter;
        this.area = Math.PI * Math.pow(this.radius, 2); 
    }
    public void areaSolve()
    {
        //πr^2 = area
        this.radius = Math.sqrt(this.area/Math.PI);
        this.diameter = 2 * this.radius;
        this.circumference = this.diameter * Math.PI;
    }
    public void circumferenceSolve()
    {
        this.diameter = this.circumference/Math.PI;
        this.radius = this.diameter/2;
        this.area = Math.PI * Math.pow(this.radius, 2); 
    }
    public void dilate(double SF)
    {
        this.radius *= SF;
        this.diameter = 2 * this.radius;
        this.circumference = this.diameter * Math.PI;
        this.area = Math.PI * Math.pow(this.radius, 2);
    }
    public void printAtt()
    {
        System.out.println("Radius: " + this.radius);
        System.out.println("Diameter: " + this.diameter);
        System.out.println("Circumference: " + this.circumference);
        System.out.println("Area: " + this.area);
    }
}