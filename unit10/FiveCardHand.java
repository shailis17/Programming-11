package unit10;

public class FiveCardHand
{
    public static void main (String[] args)
    {
        Deck d = new Deck();
        d.shuffle();
        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];
        
        for(int i = 0; i < 10; i++)
        {
           if(i%2 == 0)
           {
               hand1[i/2] = d.deck[i];
           }
           else
           {
               hand2[i/2] = d.deck[i];
           }
        }
        
        System.out.println("Hand 1: ");
        for(int x = 0; x < 5; x++)
        {
            System.out.println(hand1[x]);
        }
        System.out.println("\nHand 2: ");
        for(int x = 0; x < 5; x++)
        {
            System.out.println(hand2[x]);
        }
    }
}