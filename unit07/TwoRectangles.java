package unit07;
import java.text.DecimalFormat;

public class TwoRectangles
{
    public static void main(String args[])
    {
        DecimalFormat df = new DecimalFormat("#.###");
        
        //rectangle #1: length, width, diagonal, perimeter, area
        Rectangle rect1 = new Rectangle();
        rect1.length = 5;
        rect1.width = 3;
        rect1.diagonal = Math.sqrt(Math.pow(rect1.length, 2) + Math.pow(rect1.width,2));
        rect1.perimeter = (2*rect1.length) + (2*rect1.width);
        rect1.area = rect1.length * rect1.width;
        
        System.out.println("Attributes of Rectangle #1");
        System.out.println("    • Length: " + rect1.length);
        System.out.println("    • Width: " + rect1.width);
        System.out.println("    • Diagonal: " + df.format(rect1.diagonal));
        System.out.println("    • Perimeter: " + rect1.perimeter);
        System.out.println("    • Area: " + rect1.area + "\n");
        
        //rectangle #2: length, width, diagonal, perimeter, area;
        Rectangle rect2 = new Rectangle();
        rect2.length = 12;
        rect2.width = 7;
        rect2.diagonal = Math.sqrt(Math.pow(rect2.length, 2) + Math.pow(rect2.width,2));
        rect2.perimeter = (2*rect2.length) + (2*rect2.width);
        rect2.area = rect2.length * rect2.width;
        
        System.out.println("Attributes of Rectangle #2");
        System.out.println("    • Length: " + rect2.length);
        System.out.println("    • Width: " + rect2.width);
        System.out.println("    • Diagonal: " + df.format(rect2.diagonal));
        System.out.println("    • Perimeter: " + rect2.perimeter);
        System.out.println("    • Area: " + rect2.area);
    }
}