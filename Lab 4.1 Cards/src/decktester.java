
public class decktester {
	public static void main(String args[])
	{
		String[] rank = {"2","3","4","5","6","7","8","9","Jack","Queen","King","Ace"};
		String[] suit = {"Spade","Heart","Clubs","Diamonds"};
		int[] pointValue = {2,3,4,5,6,7,8,9,10,10,10,11};
		Deck deck = new Deck(rank,suit,pointValue);
		System.out.println(deck.isEmpty());
		System.out.println(deck.size());
		//deck.deal();
		for(int i = 0; i < deck.size(); i++)
		{
			Card x = deck.deal();
			x.toString();
		}
	}
}
