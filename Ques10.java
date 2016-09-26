package testone;

public class Ques10 {

	Ques10 ()
	{
		System.out.println("Default constructer");
	}
	Ques10(int i, int j)
	{
	      System.out.println("parameterized constructor");
	   }
	   Ques10(int i, int j, int k)
	   {
	      System.out.println("parameterized constructor");
	   }
	   public static void main(String args[])
	   {
	   		Ques10 obj = new Ques10(5,6);
	     Ques10 obj1 = new Ques10();
	     Ques10 obj2 = new Ques10(1,2,3);
	   }

}
