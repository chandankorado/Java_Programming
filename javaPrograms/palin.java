// Program to Palindrome

import java.util.Scanner;

class Palindrome
{
	public static void main(String args[])
	{
		int r, s = 0, temp;
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check :");
		x = sc.nextInt();
	
		temp = x;
		while(x > 0)
		{
			r = x % 10;
			s = (s *10) + r;
			x = x / 10; 
		}
		if(temp == s)
			System.out.println("The given number is Palindrome .");
		else
			System.out.println("The given number isn't a  Palindrome .");
	}
}