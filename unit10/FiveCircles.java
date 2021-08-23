package unit10;
import java.util.*;

public class FiveCircles
{
    public static void main (String[] args)
    {
        int r;
        Circle[] c = new Circle[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < c.length; i++)
        {
            System.out.print("Enter radius for Circle #" + (i+1));
            r = sc.nextInt();
            c[i] = new Circle(r);
        }
        
        for(int x = 0; x < c.length; x++)
        {
            System.out.println("");
            System.out.println("Circle#" + (x+1));
            c[x].printAtt();
        }
}
}