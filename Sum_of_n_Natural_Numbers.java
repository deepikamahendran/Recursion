package demo;

import java.util.Scanner;

public class Sum_of_n_natural 
{
	public static int Sum(int n)
	{
		if(n<=1)//base case
		{
			return n;
		}
		return n+Sum(n-1);//recursive
	}
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
					int number = s.nextInt();
					System.out.println(Sum(number));
		}

	}
