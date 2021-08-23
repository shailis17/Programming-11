package unit09;

public class NotQuiteMonopoly
{
    public static void main (String args [])
    {
        int rollSum, place = 0;
        Die d1 = new Die(6);
        Die d2 = new Die(6);
        
        for(int i = 1; i <=10; i++)
        {
            d1.roll();
            d2.roll();
            rollSum = d1.getFaceValue() + d2.getFaceValue();
            place += rollSum;
            place %= 40;
            
            System.out.println("You rolled a: " + rollSum);
            System.out.println(" and are at the " + place + " place.\n");
        }
    }
}