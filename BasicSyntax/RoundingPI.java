package BasicSyntax;
import java.text.*;

public class RoundingPI 

{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print(df.format(Math.PI));

	}

}