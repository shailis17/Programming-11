package unit02;

public class MixedNumbers 
{
	public static void main(String[] args) 
	{
		//declare and initialize variables
		int num = 29, denom = 8, whole, rem;
		
		//Calculations
		whole = num/denom;
		rem = num%denom;
		
		//Print Results
		System.out.print(num + "/" + denom + " = " + whole + " " + rem + "/" + denom);

	}
}
