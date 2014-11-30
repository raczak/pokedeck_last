package stock;

import java.util.Scanner;

public class Ui 
{
	private Deck d;
	private Scanner sc;
	
	public Ui()
	{
		d = new Deck();
		sc = new Scanner(System.in);
	}
	
	public void game()
	{ 
		System.out.println("MENU"); 
		System.out.println("1- Ajouter une carte au pokedeck"); 
		System.out.println("2- Supprimer une carte du pokedeck"); 
		System.out.println("3- Voir les cartes du pokedeck"); 
		System.out.println("4- Mettre à jour une carte\n");
		
		System.out.println("Entrer le numero correspondant à votre choix\n");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) 
		{ 
			case 1: addCard(); break; 
			case 2: deleteCard(); break; 
			case 3: viewDeck(); break; 
			case 4: updateCard(); break; 
			default:{ System.out.println("vous n'avez selectionné‚ aucun choix ");} 
		} 
		
		Card c;
		
	}
	
	public void addCard()
	{
		System.out.println("1- Pokemon card ?"); 
		System.out.println("2- Trainer card ?");
		System.out.println("Type de la carte ?");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) 
		{ 
			case 1: addPokemonCard(); break; 
			case 2: addTrainerCard(); break; 
			default:{ System.out.println("vous n'avez selectionné‚ aucun choix ");} 
		}
		
		
		game();
	}
	public void addPokemonCard()
	{
		System.out.println("Taper le nom de la carte à ajouter");
		String cardName = sc.nextLine();
		
		System.out.println("Taper les points de vie de la carte à ajouter");
		int cardHp = Integer.parseInt(sc.nextLine());
		
		d.createPokemon(cardName, cardHp);
	}
	public void addTrainerCard()
	{
		System.out.println("Taper le nom de la carte à ajouter");
		String cardName = sc.nextLine();
		
		System.out.println("Taper le rôle de la carte");
		String cardRole = sc.nextLine();
		
		d.createTrainer(cardName, cardRole);
	}
	public void viewDeck()
	{
		d.displayDeck();
		System.out.println("Taper sur une touche pour revenir au menu");
		if(sc.nextLine() != null)
		{
			game();
		}
	}
	public void deleteCard()
	{
		System.out.println("Taper le nom de la carte à supprimer");
		String cardName = sc.nextLine();
		d.deleteCard(d.findCard(cardName));
		game();
	}
	public void updateCard()
	{
		System.out.println("Taper le nom de la carte à mettre à jour");
		String cardName = sc.nextLine();
		System.out.println("Taper le nouveau nom de la carte");
		int index = d.findCard(cardName);
		String newCardName = sc.nextLine();
		d.updateCard(index, newCardName);
		d.displayDeck();
		System.out.println("Taper sur une touche pour revenir au menu");	
		if(sc.nextLine() != null)
		{
			game();
		}
		
	}
}
