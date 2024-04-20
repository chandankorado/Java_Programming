// Program for Division
import java.util.Scanner;

public class Div
{
	public static void main(String args[])
	{
		int num1, num2, div;
		Scanner sc = new Scanner(System.in);
		System.out.println("---Division---");
		System.out.println("Enter the two numbers to Divide : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		sc.close();
		div = num1 / num2;
		
		System.out.println("Division of Two number "+num1+" / "+num2+"  is : "+div);
	}
}