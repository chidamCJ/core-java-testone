package testone;

public class Ques9 
{
static void flex()
{
	System.out.println("static method");
	
	int a = 1;int b = 2;
	int z=a*b;
	System.out.println(+z);
}
	void create()
	{
		System.out.println("non static method");
		int a,b,c;
		a=5;
		b=6;
		c=a+b;
		System.out.println(+c);
	}
	public static void main(String [] args)
	{
		Ques9 q = new Ques9();
		q.flex();
		q.create();
	}
}
