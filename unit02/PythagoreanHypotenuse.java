package unit02;
import java.text.*;

public class PythagoreanHypotenuse 
{

	public static void main(String[] args) 
	{
		//declare + initialize
		double a = 74, b = 39.7, c;
		
		//calculate c
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
		
		//format output
		DecimalFormat df = new DecimalFormat("#.##");
		
		//print results
		System.out.print("The length of the hypotenuse is: " + df.format(c));

	}

}