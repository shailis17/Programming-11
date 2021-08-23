package unit10;

public class Property 
{
	public String name;
	public int color, numSeq, price, numHouses, baseRent, adjustedRent, housePrice, owner;
	
	public Property()
	{
		//this left blank
	}
	
	public Property(String n, int c, int numS, int p, int bR, int hP)
	{
		name = n;
		color = c;
		numSeq = numS;
		price = p;
		baseRent = bR;
		housePrice = hP;
		adjustedRent = bR;
		numHouses = 0;
		owner = 0;
	}
	
	public void newOwner(int x)
	{
		owner = x;
	}
	
	public void buildHouse()
	{
		if(numHouses < 5)
		{
			numHouses++;
		}
	}
	
	public int sellHouse()
	{
		if(numHouses > 0)
		{
			numHouses--;
			return housePrice/2;
		}
		else
		{
			return 0;
		}
	}
	
	public int mortgage()
	{
		adjustedRent = 0;
		return price/2;
	}
	
	public void unMortgage()
	{
		adjustedRent = baseRent;
	}

	public String detColor()
	{
		switch(color)
		{
		case 1:
			return "Brown";
		case 2:
			return "Light Blue";
		case 3:
			return "Pink";
		case 4:
			return "Orange";
		case 5:
			return "Red";
		case 6:
			return "Yellow";
		case 7:
			return "Green";
		case 8:
			return "Dark Blue";
		case 9:
			return "Black";
		case 10:
			return "White";
		default:
			return "ERROR";
		}
	}
	
	public String toString()
	{
		return ("Name: " + name + "\nColor: " + detColor() + "\nPrice: " + price + "\nRent: " + baseRent + "\nHouse Cost: " + housePrice + "\n\n");
	}
}