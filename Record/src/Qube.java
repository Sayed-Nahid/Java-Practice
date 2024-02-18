
public class Qube {
	int qube(int val)
	{
		return val*val;
	}
	
	int without_parameter()
	{
		return 5*5;
	}
	int without_parameter(int x)
	{
		return x*x;
	}
	int go(int... x)
	{
		int sum=0;
		for(int i :x)
		{
			sum +=i;
		}
		return sum;
	}
}
