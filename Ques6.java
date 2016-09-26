package testone;

import java.util.Scanner;

public class Ques6 
{
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	
	System.out.println("enter your course number:");
	int a=s.nextInt();
	
	
	switch(a)
	{
	case 1:
		System.out.println("ANDROID");
		break;
	case 2:
		System.out.println("DOTNET");
		break;
	case 3:
		System.out.println("JAVA PROGRAM");
		break;
		default:
			System.out.println("kindly please choose 1 OR 2 OR 3 ");
	}
	s.close();
	
	
}
}
