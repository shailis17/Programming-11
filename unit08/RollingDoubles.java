package unit08;

public class RollingDoubles
{
    public static void main (String args[])
    {
        int numDoubles = 0;
        Die d1 = new Die(6);
        Die d2 = new Die(6);
        
        for(int i = 1; i <= 100; i++)
        {
            d1.roll();
            d2.roll();
            System.out.println("Roll " + i + ": " + d1.faceValue + " and " + d2.faceValue);
            if(d1.faceValue == d2.faceValue)
            {
                numDoubles++;
            }
        }
        
        System.out.println("There were " + numDoubles + " doubles rolled.");
    }
}