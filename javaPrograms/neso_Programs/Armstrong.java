import java.util.Scanner;

public class Armstrong
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		
		int temp, digits = 0, last = 0, sum = 0;
		
		temp = num;
		while(temp >  0)
		{
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while(temp > 0)
		{
			last = temp % 10;
			sum += (Math.pow(last,digits));//(last*last*last);
			temp = temp / 10;
		}
		if(num == sum)
			System.out.println("Armstrong number ..");
		else
			System.out.println("Is not Armstrong number ..");
	}
}