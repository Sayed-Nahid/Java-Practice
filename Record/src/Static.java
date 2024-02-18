
public class Static {
	String name;
	int id;
	static int z = 5;
	static int age;
	static String answer;
	static String versity_name = "Daffodil International University";
	void dekhao2()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
	Static(String n, int x)
	{
		name = n;
		id = x;
	}
	
	
	
	void displayInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("ID Number: "+id);
		System.out.println("University Name: "+versity_name);

	}
	
	
	static void sir()
	{
		System.out.println("This is a Static Function or Method");
		System.out.println("The Number is: "+z);
	}
	void kire()
	{
		System.out.println("---------->    -----------> Bra**********");
		/*static void run()
		{
			System.out.println("Yes code Sucessfully compailed.");
		}*/
		System.out.println("Given Number is: " +z);
	}
	static 
	{
		age = 69;
		answer = "Yes!";
		System.out.println("This is a static Block");
	}
	static void display()
	{
		System.out.println("Age is: "+age);
		System.out.println("Compailer Execution: "+answer);
		System.out.println("Bro ekhon kaj hoichhe.");
	}
}
