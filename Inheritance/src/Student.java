
public class Student extends Person {
	int id;
	String versity_name;
	void dekhao()
	{
		dekhao2();
		System.out.println("ID Number: "+id);
		System.out.println("University Name: "+versity_name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVersity_name() {
		return versity_name;
	}
	public void setVersity_name(String versity_name) {
		this.versity_name = versity_name;
	}
}
