package demo;

import java.util.Scanner;

public class Reverse 
{
	static int sum=0;
	public static int rev(int n)
	{
		if(n==0)//base case
		{
			return 0;
		}
		int temp=n%10;
		sum=sum*10+temp;
		rev(n/10);
		return sum;//recursive
	}
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
					int number = s.nextInt();
					System.out.println(rev(number));
		}

	}
