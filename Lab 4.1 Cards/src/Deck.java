import java.util.ArrayList;

public class Deck 
{
	ArrayList<Card> unDealt;
	ArrayList<Card> dealt;
	
	public Deck(String[] rank,String[] suit,int[] pointValue)
	{
		unDealt = new ArrayList<Card>();
		dealt = new ArrayList<Card>();
		int r = 0;
		int s = 0;
		int p = 0;
		for(int i = 51; i >= 1 ; i--)
		{
			if(s <= suit.length - 1)
			{
				unDealt.add(new Card(rank[r],suit[s],pointValue[p]));
				s++;
			}
			else
			{
				r++;
				p++;
				s = 0;
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
			unDealt.set(r, z);
			Card y = unDealt.get(r);
			unDealt.set(k, y);
		}
		for(int k = 51; k >= 1; k--)
		{
			Card m = unDealt.get(k);
			int r = 0;
			if(unDealt.get(k - 1) != null)
			{
				if(m.getpointValue() < unDealt.get(k - 1).getpointValue())
				{
					r = k - 1;
				}
			}	
			else
			{
				r = k;
			}
			Card z = unDealt.get(k);
			unDealt.set(r, z);
			Card y = unDealt.get(r);
			unDealt.set(k, y);
		}
	}
}
