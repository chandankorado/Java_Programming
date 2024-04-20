// Program for subtraction 
import java.util.Scanner;

public class Sub
{
	public static void main(String args[])
	{
		int num1, num2, sub;
		Scanner sc = new Scanner(System.in);
		System.out.println("---SUBTRACTION--");
		
		System.out.println("Enter the bigger number :");
		num1 = sc.nextInt();
		
		System.out.println("Enter the smaller number :");
		num2 = sc.nextInt();
		
		sc.close();
		sub = num1 - num2;
		
		System.out.println("Subtraction of two number is : "+sub);
	}
}