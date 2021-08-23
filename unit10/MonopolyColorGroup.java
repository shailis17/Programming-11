package unit10;

public class MonopolyColorGroup
{
    public static void main (String[] args)
    {
        //public String name;
	//public int color, numSeq, price, numHouses, baseRent, adjustedRent, housePrice, owner;

        Property[] lightBlue = new Property[3];
        lightBlue[0] = new Property("Oriental Avenue", 2, 4, 100, 6, 50);
        lightBlue[1] = new Property("Vermont Avenue", 2, 5, 100, 6, 50);
        lightBlue[2] = new Property("Connecticut Avenue", 2, 6, 120, 6, 50);
        
        for(int i = 0; i < lightBlue.length; i++)
        {
            System.out.println(lightBlue[i]);
        }
        
        /*
         * Property Name       BPrice BRent Num in Seq	House Price
         * Oriental Avenue	100	6	4	50
           Vermont Avenue	100	6	5	50
           Connecticut Avenue	120	8	6	50
         */
    }
}