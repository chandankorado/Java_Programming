import java.util.Scanner;

public class ScanerObject
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		//int a = input.nextInt();
		//float b = input.nextFloat();
		//double c = input.nextDouble();
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		//System.out.println(10 + a);
		
		System.out.println(input.nextInt());
		System.out.println(input.nextFloat());
		System.out.println(input.nextDouble());
		System.out.println(input.nextBoolean());
		System.out.println(input.next());   // String
		System.out.println(input.nextLine()); // wil print a nextline
	}
}

/*import java.util.Scanner;
public class ScanerObject
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); // input stream class
		
		//   System.out.println(input.nextInt());
		
		int a = input.nextInt();    // it take input of a b c then print all
		float b = input.nextFloat();
		double c = input.nextDouble();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//	System.out.println(input.nextint());     -- it will print next after input given
		//	System.out.println(input.nextFloat());
		//	System.out.println(input.nextDouble());
		
	}
}	*/