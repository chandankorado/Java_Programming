// Program for Arithmatic Operation

import java.util.Scanner;

public class Arith
{
	public static void main(String args[])
	{
		int num1, num2, sum, div, mul, sub, mod;
		Scanner ob = new Scanner(System.in);
		System.out.println("---Arithmatic Operations---");
		System.out.println("Enter 2 num for Arithmatic Operations : ");
		
		num1 = ob.nextInt();
		num2 = ob.nextInt();
		
		ob.close();
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		
		System.out.println("Summat.. of "+num1+" + "+num2+" is :    "+sum);
		System.out.println("Subtra.. of "+num1+" - "+num2+" is :    "+sub);
		System.out.println("Multip.. of "+num1+" * "+num2+" is :    "+mul);
		System.out.println("Divisi.. of "+num1+" / "+num2+" is :    "+div);
		System.out.println("Modulo.. of "+num1+" % "+num2+" is :    "+mod);
	}
}