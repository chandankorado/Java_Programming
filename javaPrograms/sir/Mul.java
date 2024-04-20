// Program for Multiplication

import java.util.Scanner;

public class Mul
{
	public static void main(String args[])
	{
		int num1, num2, num3, mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("---Multiplication---");
		System.out.println("Enter the 3 numbers to Multiple :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sc.close();
		
		mul = num1 * num2 * num3;
		System.out.println("Multiple of three numbers is : "+mul);
	}
}