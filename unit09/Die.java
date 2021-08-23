package unit09;
import java.util.*;

public class Die
{
    private int numSides, faceValue;
    
    public Die(int s)
    {
       numSides = s; 
    }
    public void roll()
    {
        Random rand = new Random();
        faceValue = rand.nextInt(numSides) + 1;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
}