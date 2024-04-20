import java.util.Scanner;

public class Factorial
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number : ");	
		num = sc.nextInt();
		long fact = 1;
		int i = 1;
	
		while(i <= num)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of  "+num+"  is : "+fact);
	}
}