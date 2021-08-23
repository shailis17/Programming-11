package unit02;
import java.text.*;

public class PythagoreanLeg 
{

	public static void main(String[] args) 
	{
		double a = 10, b, c= 38;
		
		b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("The lenghth of Leg B is: " + df.format(b));

	}

}