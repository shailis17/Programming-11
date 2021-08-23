package unit03;
import java.util.*;

public class FirstIntroduction 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String userName, myName = "Shaili";
		
		System.out.println("Hey! What's your name?");
		userName = sc.nextLine();
		sc.close();
		System.out.println("Hi, " + userName + "! My name is " + myName);

	}

}