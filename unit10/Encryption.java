package unit10;
import java.util.*;

public class Encryption
{
    public static void main (String[] args)
    {
        int shift;
        String message, code = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is message do you want to encrypt?");
        System.out.println("NOTE: enter the message in ALL CAPS");
        message = sc.nextLine();
        
        System.out.println("What is the shift key? ");
        System.out.println("NOTE: enter an positive number to shift right, a negative number to shift left.");
        shift = sc.nextInt();
        
        for(int i=0; i < message.length();i++) 
	{
	    char letter = message.charAt(i);
            if (letter >= 65 && letter <= 90)
            {
            	letter += shift;
            	if (letter  < 65)
            	{
            	    letter +=26;
            	}
            	else if (letter >90)
            	{
            	    letter -= 26;
                }
            }
            code += letter;
	}
	System.out.println("Encrytion: " + code);
        
    }
}