
public class Block extends Static{
	double height;
	int y;
	static
	{
		System.out.println("Bhaire Bhai eitao kaj kore!");
	}
	void bl()
	{
		System.out.println("Na parlam na. mone hoy Method call kora lagbei");
	}
	void change(Block r)
	{		
		r.y = 500;
	}
	
	void dekhao()
	{
		dekhao2();
		System.out.println("Height: "+height);
	}
	
	
	
	
}
