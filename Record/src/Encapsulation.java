
public class Encapsulation {
	private String name, versity_name, company_name, home_town;
	private int tread_number, Business_code_number, year;
	private void set(String name, int i, String versity_name)
	{
		this.name = name;
		tread_number = i;
		this.versity_name = versity_name;
	}
	private String get()
	{
		System.out.println("Name: "+name);
	}
}
