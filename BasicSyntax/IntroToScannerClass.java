package BasicSyntax;
import java.util.*;

public class IntroToScannerClass 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		sc.close();
		System.out.println("Your age: " + age);
		
		/*
		 * sc.nextLine(); allows for reset back to word mode
		 */
		
	}

}