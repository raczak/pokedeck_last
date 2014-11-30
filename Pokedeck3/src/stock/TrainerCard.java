package stock;

public class TrainerCard extends Card
{
	private String role;
	
	public TrainerCard(String cardName, String cardRole)
	{
		name = cardName;
		role = cardRole;
	}
	
	public void display()
	{
		super.display();
		System.out.println(role);
	}
}
