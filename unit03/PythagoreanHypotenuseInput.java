package unit03;
import java.text.DecimalFormat;
import java.util.*;

public class PythagoreanHypotenuseInput 
{

	public static void main(String[] args) 
	{
		//declare variables
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		//get user input
		System.out.println("Enter Leg a: ");
		a = sc.nextDouble();
		System.out.println("Enter Leg b: ");
		b = sc.nextDouble();
		
		//calculate + format c value
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
		DecimalFormat df = new DecimalFormat("#.##");
		
		//print results
		System.out.print("The length of the hypotenuse is: " + df.format(c));
	}

}