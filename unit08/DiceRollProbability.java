package unit08;
import java.util.*;

public class DiceRollProbability
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0, first = 0, sum, num;
        Die d1 = new Die(6);
        Die d2 = new Die(6);
        
        System.out.print("What sum do you want to roll? ");
        num = sc.nextInt();
        
        for(int i = 1; i <= 100; i++)
        {
            d1.roll();
            d2.roll();
            sum = d1.faceValue + d2.faceValue;
            System.out.println("Roll " + i + ": " + d1.faceValue + " and " + d2.faceValue);
            if(sum == num)
            {
                count++;
                if(first == 0)
                {
                    first = i;
                }
            }
        }
        
        System.out.println("The sum " + num + " was rolled " + count + " times.");
        System.out.println("The first time the number " + num + " was rolled was on Roll " + first);
    }
}