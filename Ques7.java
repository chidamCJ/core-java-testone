package testone;

import java.util.Scanner;

public class Ques7
{
public static void main (String args[])
{
	Scanner input= new Scanner(System.in);
	System.out.println("which number want to skip:");
	int n=input.nextInt();
	int i;
	for(i=0;i<10;i++)
	{
		if(i==n)
		{
			continue;
		}
		System.out.println("count is :" +i);
		input.close();
	}
}
}
