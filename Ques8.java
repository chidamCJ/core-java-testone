package testone;

public class Ques8 
{
public static void main(String [] args)
{
	
	int i=sub(4, 3);
	
	System.out.println(add());
	System.out.println(i);
	
	mix();
	
}
	static int add()
	{
		int a = 2,b = 3;
		int c=a+b;
		return c;
	}
	static int sub(int a, int b)
	{
		int c=a-b;
		return c;
		
	}
	static void mix()
	{
		double a = 04,b = 05,c;
		c=a*b;
		System.out.println(c);
		
	}
	
	
}
