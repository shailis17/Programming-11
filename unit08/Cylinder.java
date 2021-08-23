package unit08;

public class Cylinder
{
    public double radius, height, volume, surfaceArea;
    public Circle base;
    public Rectangle lateral;
    
    public Cylinder()
    {
        this.base = new Circle();
        this.lateral = new Rectangle();
    }
    public Cylinder(double r, double h)
    {
        this.radius = r;
        this.height = h;
        this.base = new Circle(r);
        this.lateral = new Rectangle(h, this.base.circumference);
        this.volume = this.base.area * this.height;
        this.surfaceArea = (2 * this.base.area) + this.lateral.area;
    }
    public void printAtt()
    {
        System.out.println("Radius: " + this.radius);
        System.out.println("Height: " + this.height);
        System.out.println("Base Area: " + this.base.area);
        System.out.println("Lateral Area: " + this.lateral.area);
        System.out.println("Surface Area: " + this.surfaceArea);
        System.out.println("Volume: " + this.volume);
    }
}