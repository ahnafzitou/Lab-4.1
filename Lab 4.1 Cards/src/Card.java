
public class Card 
{
	String rank;
	String suit;
	int pointValue;
	
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	public String getrank()
	{
		return this.rank;
	}
	public String getsuit()
	{
		return this.suit;
	}
	public int getpointValue()
	{
		return this.pointValue;
	}
	public boolean equals(Card otherCard)
	{
		if(this.pointValue == otherCard.pointValue)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	public String toString()
	{
		return rank + "" + suit;	
	}
}
