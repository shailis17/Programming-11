package unit04;
import java.util.Scanner;

public class Even
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
			int num;
			boolean even;
			
			System.out.println("Enter a number:");
			num = sc.nextInt();
			
			even = num%2 == 0;
			
	    System.out.print(num + " is ");
			if(!even)
				System.out.print(num + "not ");

	    System.out.print("even."); 
    }
}