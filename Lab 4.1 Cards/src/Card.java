
public class Card 
{
	String rank;
	String suite;
	int pointValue;
	
	public Card(String rank, String suite, int pointValue)
	{
		this.rank = rank;
		this.suite = suite;
		this.pointValue = pointValue;
	}
	public String getrank()
	{
		return this.rank;
	}
	public String getsuite()
	{
		return this.suite;
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
		return this.rank + " " + this.suite;	
	}
}
