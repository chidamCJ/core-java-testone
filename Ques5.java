package testone;

import java.util.Scanner;

public class Ques5 
{
public static void main (String [] args)
{
	int x,y,z;
	System.out.println("enter the 3 integers:");
	Scanner s=new Scanner(System.in);
	
	x=s.nextInt();
	y=s.nextInt();
	z=s.nextInt();
	
	if(x>y && x>z)
		System.out.println("first num is large");
	else if (y>z && y>x)
		System.out.println("second number is large");
	else if (z>x && z>x)
		System.out.println("third is large");
	
	if(x<y && x<z)
		System.out.println("first num is small");
	else if (y<z && y<x)
		System.out.println("second number is small");
	else if (z<x && z<x)
		System.out.println("third is small");
	
	
	
	else
		System.out.println("infinite");
s.close();
}
}
