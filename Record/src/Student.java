
public class Student {
	String name, versity_name;
	int id, semester;
	void in(String n, int r, int y, String v)
	{
		name = n;
		id = r;
		semester = y;
		versity_name = v;
	}
	void out()
	{
		System.out.println("Name: "+name);
		System.out.println("ID Numbre: "+id);
		System.out.println("Semester Number: "+semester);
		System.out.println("University Name: "+versity_name);
	}
}
