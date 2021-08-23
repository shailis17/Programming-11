package unit10;

public class Card 
{
	public int faceValue, numSeq;
	public String suit, number;
	public boolean red, black;
	
	public Card()
	{
		
	}
	
	public Card(int nS)
	{
		numSeq = nS;
		detFaceVal(numSeq);
		detSuitColor(numSeq);
		detNumber();
	}
	
	public void detFaceVal(int x)
	{
		faceValue = x % 13;
	}
	
	public void detSuitColor(int x)
	{
		if(x >= 0 && x <= 12)
		{
			suit = "♣";
			red = true;
			black = false;
		}
		else if(x >= 13 && x <= 25)
		{
			suit = "♦";
			red = false;
			black = true;
		}
		else if(x >= 26 && x <= 38)
		{
			suit = "♥";
			red = true;
			black = false;
		}
		else if(x >= 39 && x <= 51)
		{
			suit = "♠";
			red = false;
			black = true;
		}
	}

	public void detNumber()
	{
		int num = faceValue + 1;
		switch(num)
    		{
    		case 1:
    			number = "A";
    			break;
    		case 2:
    		case 3:
    		case 4:
    		case 5:
    		case 6:
    		case 7:
    		case 8:
    		case 9:
    		case 10:
    			number = Integer.toString(num);
    			break;
    		case 11:
    			number = "J";
    			break;
    		case 12:
    			number = "Q";
    			break;
    		case 13:
    			number = "K";
    			break;
		}
	}

	public String toString()
	{
		String card;
		card = number + suit;
		return card;
	}

}