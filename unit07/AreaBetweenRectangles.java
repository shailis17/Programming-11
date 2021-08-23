package unit07;

public class AreaBetweenRectangles
{
    public static void main(String args[])
    {
        //rectangle #1: length, width, area
        Rectangle rect1 = new Rectangle();
        rect1.length = 5;
        rect1.width = 3;
        rect1.area = rect1.length * rect1.width;
        
        //rectangle #2: length, width, area
        Rectangle rect2 = new Rectangle();
        rect2.length = 12;
        rect2.width = 7;
        rect2.area = rect2.length * rect2.width;
        
        //calculate area between rectangles
        double areaBetween;
        areaBetween = rect2.area - rect1.area;
        
        System.out.print("The area between the two rectangles is: " + Math.abs(areaBetween));
    }
}