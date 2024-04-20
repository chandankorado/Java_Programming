import java.util.Scanner;

public class ScanerObject1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = input.next();
		
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		
		System.out.println("Hey ! "+name);
		System.out.println("Are you also "+age+" year old...");
	}
}