package unit03;
import java.text.DecimalFormat;
import java.util.*;

public class DistanceFormula 
{

	public static void main(String[] args) 
	{
		//declare variables and scanner 
		double x1, x2, y1, y2, xDiff, yDiff, distance;
		Scanner sc = new Scanner(System.in);
		
		//get inputs
		System.out.println("Enter x1: ");
		x1 = sc.nextDouble();
		System.out.println("Enter y1: ");
		y1 = sc.nextDouble();
		System.out.println("Enter x2: ");
		x2= sc.nextDouble();
		System.out.println("Enter y2: ");
		y2 = sc.nextDouble();
		
		//calculate and format
		xDiff = x2 - x1;
		yDiff = y2 - y1;
		distance = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
		
		DecimalFormat df = new DecimalFormat("#.##");
				
		//print results
		System.out.println("The distance between the two points is: " + df.format(distance));
				
	}

}