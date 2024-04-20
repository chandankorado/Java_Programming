import java.util.Scanner;

public class Palindrome
{
	public static void main(String args[])
	{
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		original = sc.nextLine();
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
	
		if(original.equals(reverse))
			System.out.println("Number/String is a Palindrome");
		else
			System.out.println("Number/String is not a Palindrome");
	}
}