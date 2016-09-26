package testone;
import java.util.Scanner;


public class Ques3
{
public static void main (String [] args)
{
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("Enter the  three names:");
	String name1 =s.next();
	String name2 =s.next();
	String name3 =s.next();
	
	System.out.println(name1 + name2 + name3);
	s.close();
}
}

