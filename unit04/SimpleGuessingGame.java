package unit04;
import java.util.*;

public class SimpleGuessingGame
{
    public static void main(String[] args)
    {
        //declare scanner and variables
        Scanner sc = new Scanner(System.in);
        int num = 17, guess;
        boolean correct = false;
        
        //get inputs
        System.out.print("Enter a guess");
        guess = sc.nextInt();
        
        //check the answer
        if(num == guess)
        correct = true;
        
        //print results
        
        System.out.print("Your guess is... ");
        
        if(!correct)
        System.out.print("not ");
        
        System.out.print("correct");
        
    }
}