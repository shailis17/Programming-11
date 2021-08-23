package unit04;
import java.util.*;

public class GuessMyNumber
{
    // instance variables - replace the example below with your own
    
    public static void main(String args [])
    {
        int num = 57, guess;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 100: ");
        guess = sc.nextInt();
        
        if(guess > 100 || guess < 0)
        {
            System.out.print("Number invalid");
        }
        else
        {
            if(guess > num)
                System.out.print("Your guess is too high");
            else if(guess < num)
                System.out.print("Your guess is too low");
            else
                System.out.print("You guessed my number... YAY!!!");
        }
    }
}