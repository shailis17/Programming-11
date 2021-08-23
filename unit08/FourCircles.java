package unit08;

public class FourCircles
{
    public static void main (String args[])
    {
        //use radius
        System.out.println("Circle 1: ");
        Circle c1 = new Circle(5);
        c1.printAtt();
        
        //use diameterSolve
        System.out.println(" \nCircle 2: ");
        Circle c2 = new Circle();
        c2.diameter = 22;
        c2.diameterSolve();
        c2.printAtt();
        
        //use circumference solve
        System.out.println(" \nCircle 3: ");
        Circle c3 = new Circle();
        c3.circumference = 35;
        c3.circumferenceSolve();
        c3.printAtt();
        
        //use area solve
        System.out.println(" \nCircle 4: ");
        Circle c4 = new Circle();
        c4.area = 58;
        c4.areaSolve();
        c4.printAtt();
        
    }
}