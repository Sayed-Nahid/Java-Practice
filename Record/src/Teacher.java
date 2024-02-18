
public class Teacher {
	String name, home_town, varsity_name;
	int id;
	Teacher(String n, int i, String h, String v)
	{
		name = n;
		id = i;
		home_town = h;
		varsity_name = v;
	}
	void displayinfo()
	{
		System.out.println("Name: "+name);
		System.out.println("ID Number: "+id);
		System.out.println("Home Town: "+home_town);
		System.out.println("University Name: "+varsity_name);
	}
}
