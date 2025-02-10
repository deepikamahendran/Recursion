package demo;

import java.util.Scanner;

public class Fibonacci 
{
public static int fib(int n)
{
	if(n<=1)//base case
	{
		return n;
	}
	return fib(n-1)+fib(n-2);//recursive
}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
				int number = s.nextInt();
				for(int i=0;i<number;i++)
				{
				System.out.println("Fibanacci of "+number+" is : "+fib(i));
				}
	}

}
