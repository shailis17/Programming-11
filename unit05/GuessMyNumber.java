package unit05;
import java.util.*;

public class GuessMyNumber
{
    public static void main(String args[])
    {
        int num, guess, count = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        num = rand.nextInt(100) + 1;
        
        System.out.println("Let's play a game and see if you can guess my number");
        System.out.println("This number is in between 1 and 100");
        System.out.println("You MUST guess the number in under 10 tries of you lose the game");
        System.out.println("GOOD LUCK!!!");
        
        do
        {
            System.out.println("Enter a guess ");
            guess = sc.nextInt();
            
            if(guess >=1 && guess <= 100)
            {
                if(guess == num)
                {
                    count = 11;
                }
                else if(guess < num)
                {
                    count++;
                    System.out.print("Your guess is too low \nTry again... ");
                }
                else if(guess > num)
                {
                    count++;
                    System.out.print("Your guess is too high \nTry again... ");
                }
            }
            else
            {
                System.out.println("Invalid guess... the range is 1 - 100 ");
                System.out.print("Try again... ");
            }
        }while(count <= 10);
        
        if(guess == num)
        {
            System.out.print("You won!!!");
        }
        else if (guess != num)
        {
            System.out.print("Because you lost! \nMy number was " + num + ".");
        }
    }
}