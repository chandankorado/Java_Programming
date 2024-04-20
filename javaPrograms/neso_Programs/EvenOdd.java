import java.util.Scanner;

public class EvenOdd
{
	public static void main(String args[])
	{
		System.out.print("Enetr the number : ");
		
		Scanner s = new Scanner(System.in);
	//	int n = s.nextInt();
		
		if(s.nextInt() == 0)
			System.out.println("Number  is Even..");
		else
			System.out.println("Number  is Odd..");
	}
}