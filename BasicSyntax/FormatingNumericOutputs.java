package BasicSyntax;
import java.text.*;

public class FormatingNumericOutputs 
{

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#,###.##");
		double x = 5.13984432;
		System.out.print(df.format(x));
	}

}