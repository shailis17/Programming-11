package unit10;
import java.util.*;

public class Deck
{
    public Card[] deck = new Card[52];
    public Random rand = new Random();
    
    public Deck()
    {
        for(int i = 0; i < deck.length; i++)
        {
            deck[i] = new Card(i);
        }
    }
    public void Card()     
    {
        int chosen = rand.nextInt(52);
        System.out.println(deck[chosen]);
    }
    public void printDeck()
    {
        for(int i = 0; i < 52; i++)
        {
            System.out.println(deck[i]);
        }
    }
    public void shuffle()
    {
        int used[] = new int[52];
        int r;
        Deck d = new Deck();
        for(int i = 0; i < used.length; i++)
        {
        used[i] = -1;
        }
        for(int i = 0; i < deck.length; i++)
        {
            do
            {
                r = rand.nextInt(deck.length);	
            }while(inUsed(used, r));
            used[i] = r;
            deck[i] = d.deck[r];
        }
    }
    private boolean inUsed(int [] used, int x)
    {
        boolean present = false;
        for(int i = 0; i < used.length; i++)
        {
            if(used[i] == x)
            {
                present = true;
            }
        }
        return present;
    }
}