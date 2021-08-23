package unit08;

public class Rectangle
{
    public double length, width, diagonal, perimeter, area;
    
    public Rectangle()
    {
       
    }
    public Rectangle(double l, double w)
    {
        this.length = l;
        this.width = w;
        this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width,2));
        this.perimeter = (2*this.length) + (2*this.width);
        this.area = this.length * this.width;
    }
    public Rectangle(double s)
    {
        this.length = s;
        this.width = s;
        this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width,2));
        this.perimeter = (2*this.length) + (2*this.width);
        this.area = this.length * this.width;
    }
    public void squarePerimeterSolve()
    {
        this.length = this.perimeter/4.0;
        this.width = this.length;
        this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width,2));
        this.area = this.length * this.width;
    }
    public void squareAreaSolve()
    {
        this.length = Math.sqrt(this.area);
        this.width = this.length;
        this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width,2));
        this.perimeter = this.perimeter = (2*this.length) + (2*this.width);
    }
    public void printAtt()
    {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Diagonal: " + this.diagonal);
        System.out.println("Perimeter: " + this.perimeter);
        System.out.println("Area: " + this.area);
    }
}