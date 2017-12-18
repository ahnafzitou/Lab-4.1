import java.util.ArrayList;

public class Deck 
{
	ArrayList<Card> unDealt;
	ArrayList<Card> dealt;
	
	public Deck(String[] rank,String[] suit,int[] pointValue)
	{
		unDealt = new ArrayList<Card>();
		dealt = new ArrayList<Card>();
		for(int s = 0; s < suit.length ; s++)
		{
			for(int i = 0; i < rank.length; i++)
			{
				unDealt.add(new Card(rank[i],suit[s],pointValue[i]));
			}	
		}
	}
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int size()
	{
		return unDealt.size();
	}
	public Card deal()
	{
		if(unDealt.size() != 0)
		{
			Card x = unDealt.get(0);
			unDealt.remove(0);
			dealt.add(x);
			return x;
		}
		else
		{	
			return null;
		}
	}
	public void shuffle()
	{
		for(int i = 0; i < dealt.size(); i++)
		{
			Card x = dealt.get(i);
			dealt.remove(i);
			unDealt.add(x);
		}
		for(int k = 51; k >= 0; k--)
		{
			int r = (int)(Math.random() * k);
			Card removedCard = unDealt.set(k, unDealt.get(r));
			unDealt.set(r, removedCard);
		}
	}
}
