package stock;

import java.util.ArrayList;

public class Deck 
{
	private ArrayList<Card> deck;
	
	public Deck()
	{
		deck = new ArrayList<Card>();
	}
	
	public Card getCard(int index)
	{
		return deck.get(index);
	}
	
	public void createPokemon(String cardName, int cardHp)
	{
		Card p = new PokemonCard(cardName, cardHp);
		deck.add(p);
	}
	public void createTrainer(String cardName, String cardRole)
	{
		Card t = new TrainerCard(cardName, cardRole);
		deck.add(t);
	}
	
	public void displayDeck()
	{
		for(Card c : deck)
		{
			c.display();
		}
	}
	
	public int findCard(String name)
	{
		int index = -1;
		int cpt = 0;
		for(Card c : deck)
		{
			if(c.name.equals(name))
			{
				index = cpt;
				break;
			}
			cpt++;
		}
		return index;
	}
	
	public void deleteCard(int cardIndex)
	{
		this.deck.remove(cardIndex);
	}
	
	public void updateCard(int cardIndex, String name)
	{
		Card card = getCard(cardIndex);
		card.name = name;
		
	}
	
	
}
