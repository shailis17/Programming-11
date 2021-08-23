package unit07;

public class ConcetricCircles
{
    public static void main (String args[])
    {
        //inner circle
        Circle inner = new Circle();
        inner.radius = 4;
        inner.diameter = inner.radius * 2;
        inner.circumference = inner.diameter * Math.PI;
        inner.area = Math.pow(inner.radius, 2) * Math.PI; 
        
        System.out.println("Radius: " + inner.radius);
        System.out.println("Diameter: " + inner.diameter);
        System.out.println("Circumference: " + inner.circumference);
        System.out.println("Area: " + inner.area);
        
        //outer circle
        Circle outer = new Circle();
        outer.radius = 8;
        outer.diameter = outer.radius * 2;
        outer.circumference = outer.diameter * Math.PI;
        outer.area = Math.pow(outer.radius, 2) * Math.PI; 
        
        System.out.println("Radius: " + outer.radius);
        System.out.println("Diameter: " + outer.diameter);
        System.out.println("Circumference: " + outer.circumference);
        System.out.println("Area: " + outer.area);
    }
}