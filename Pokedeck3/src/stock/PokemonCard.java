package stock;

public class PokemonCard extends Card
{
	private int hp;
	public PokemonCard(String cardName, int cardHp)
	{
		name = cardName; // On ne le redéclare pas en private car il existe deja dans la class mere(polymorphisme)
		hp = cardHp;
	}
	
	public void display()
	{
		super.display();
		System.out.println(hp+"\n");
	}

}

