package unit08;

public class RectanglesAndSquares
{
    public static void main (String args[])
    {
       Rectangle rectangle = new Rectangle(5,3);
       Rectangle square = new Rectangle(6);
       
       System.out.println("Rectangle Attributes:");
       rectangle.printAtt();
       
       System.out.println("\nSquare Attributes:");
       square.printAtt();
    }
}