package unit08;
import java.util.*;

public class Die
{
    public int numSides, faceValue;
    
    public Die(int s)
    {
       this.numSides = s; 
    }
    public void roll()
    {
        Random rand = new Random();
        this.faceValue = rand.nextInt(this.numSides) + 1;
    }
}