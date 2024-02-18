
public class Registration {
	String name, id, versity_mail, title;
	int code;
	Registration(String name, String id, String versity_mail, int code, String title)
	{
		this.name = name;
		this.id = id;
		this.versity_mail = versity_mail;
		this.code = code;
		this.title = title;
	}
	Registration(String name, String id, String versity_mail)
	{
		this.name = name;
		this.id = id;
		this.versity_mail = versity_mail;
	}
	void display()
	{
		System.out.println("Your Name is: "+name);
		System.out.println("Your ID is: "+id);
		System.out.println("Your Versity Mail: "+versity_mail);
		if(code != 0)
		{
			System.out.println("Code Number: "+code);
			System.out.println("Book Title: "+title);
		}
		else
		{
			System.out.println("You Have not selected any book til now. Please Go back and Select any Book from our Library.");
		}
	}
}