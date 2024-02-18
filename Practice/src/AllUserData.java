
public class AllUserData extends Game{
	int  playerID;
	String  playerName;
	String playerEmail;
	int movementSpeed;
	String playerHP;
	String playerMovementSpreed (int movementSpeed)
	{
		this.movementSpeed = movementSpeed;
		if(movementSpeed == 0)
		{
			return "slow";
		}
		else
		{
			return  "fast";
		}
	}
	String playerHealthPoint (String playerHP)
	{
		this.playerHP = playerHP;
		return playerHP;
	}
	AllUserData(int id, String name, String email)
	{
		playerID = id;
		playerName = name;
		playerEmail = email;
	}
	void display()
	{
		System.out.println("ID: "+playerID);
		System.out.println("ID: "+playerName);
		System.out.println("ID: "+playerEmail);
	}
}
