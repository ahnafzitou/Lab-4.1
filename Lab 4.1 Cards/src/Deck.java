import java.util.ArrayList;

public class Deck 
{
	ArrayList<Card> unDealt;
	ArrayList<Card> dealt;
	
	public Deck(String[] rank,String[] suit,int[] pointValue)
	{
		for(int i = 0; i < rank.length; i++)
		{
			unDealt.add(new Card(rank[i],suit[i],pointValue[i]));
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
		
		for(int i = 0; i < unDealt.size(); i++)
		{
			if(unDealt.size() != 0)
			{
				Card x = unDealt.get(i);
				unDealt.remove(i);
				dealt.add(x);
				return x;
			}
		}
		return null;
	}
	public void shuffle()
	{
		for(int i = 0; i < dealt.size(); i++)
		{
			Card x = dealt.get(i);
			dealt.remove(i);
			unDealt.add(x);
		}
		for(int k = 51; k >= 1; k--)
		{
			int r = (int)(Math.random() * (k + 1));
			Card z = unDealt.get(k);
			unDealt.remove(k);
			Card y = unDealt.get(r);
			unDealt.add(r,z);
			unDealt.add(k,y);
		}
		for(int k = 51; k >= 1; k--)
		{
			
		}
	}
}
