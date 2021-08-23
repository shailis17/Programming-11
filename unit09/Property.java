package unit09;

public class Property
{
    private String name;
    private int color, numberInSequence, price, numHouses, rent, housePrice, owner, updatedRent;
    
    public Property(String name, int color, int numberInSequence, int price, int numHouses, int rent, int housePrice)
    {
        
    }
    public void newOwner(int owner)
    {
        this.owner = owner;
    }
    public void buyHouse()
    {
        numHouses ++;
    }
    public void sellHouse()
    {
        numHouses --;
    }
    public void mortage()
    {
       updatedRent = 0;
       housePrice /= 2;
    }
    public String getName()
    {
        return name;
    }
    public int getColor()
    {
        return color;
    }
    public int getNumInSequence()
    {
        return numberInSequence;
    }
    public int getPrice()
    {
        return price;
    }
    public int getNumHouses()
    {
        return numHouses;
    }
    public int getRent()
    {
        return rent;
    }
    public int getHousePrice()
    {
        return housePrice;
    }
    public int getOwner()
    {
        return owner;
    }
    public int getNewRent()
    {
        return updatedRent;
    }
}