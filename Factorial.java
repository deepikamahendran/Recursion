package demo;

import java.util.Scanner;

public class Factorial 
{
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
			int number = s.nextInt();
			System.out.println("Factorial of "+number+" is : "+fact(number));
	
}
}
